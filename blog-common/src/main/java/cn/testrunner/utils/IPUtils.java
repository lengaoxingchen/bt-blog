package cn.testrunner.utils;

import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

/**
 * @author v_lvjichao
 */
public class IPUtils {
    /**
     * 网页请求获取iP
     *
     * @param request
     * @return
     */

    public static String getRemoteAddr(HttpServletRequest request) {
        String ip = request.getHeader("X-Forwarded-For");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
            if (ip.equals("127.0.0.1")) {
                InetAddress inet = null;
                try {
                    inet = InetAddress.getLocalHost();
                } catch (UnknownHostException var4) {
                    var4.printStackTrace();
                }
                ip = ObjectUtils.isNotNull(inet) ? inet.getHostAddress() : "";
            }
        }
        return ip;
    }

    /**
     * 根据ip解析地址
     *
     * @param strIP
     * @return
     */
    public static String getAddressByIP(String strIP) {
        String msg = "";
        try {
            URL url = new URL("http://ip.taobao.com/service/getIpInfo.php?ip=" + strIP);
            URLConnection conn = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            String line = null;
            StringBuffer result = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
            reader.close();

            String code = "{\"code\":";
            if ("0".equals(String.valueOf(result.toString().charAt(result.toString().indexOf(code) + code.length())))) {
                String country = ",\"country\":\"";
                msg += getDetail(result.toString(), country);

                String area = ",\"area\":\"";
                msg += getDetail(result.toString(), area);

                String region = ",\"region\":\"";
                msg += getDetail(result.toString(), region);

                String city = ",\"city\":\"";
                msg += getDetail(result.toString(), city);
            } else {
                msg = "无效查询";
            }

        } catch (IOException e) {
            msg = "无效查询";
        }
        return msg;
    }

    /**
     * 获取相应信息
     *
     * @param str
     * @param substr
     * @return
     */
    public static String getDetail(String str, String substr) {
        String result = " ";
        int substr_index = str.indexOf(substr) + substr.length();
        while (!"\"".equals(String.valueOf(str.charAt(substr_index)))) {
            result += String.valueOf(str.charAt(substr_index));
            substr_index++;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = getAddressByIP("172.33.149.76");
        System.out.println(str);
    }

}

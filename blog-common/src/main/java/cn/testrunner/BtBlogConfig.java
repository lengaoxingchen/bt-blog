package cn.testrunner;

import com.alibaba.edas.acm.ConfigService;

import java.util.Properties;

/**
 * 从 阿里云配置中心获取config配置
 *
 * @author v_lvjichao
 */
public class BtBlogConfig {
    private static Properties blogCfg = new Properties();

    public static void initAndWatchConfig() {
        final String dataId = "cipher-bt_blog";
        final String group = "DEFAULT_GROUP";
        final long timeoutInMills = 3000;

        //从命名空间详细对话中copy各变量的值
        Properties properties = new Properties();
        properties.put("endpoint", "acm.aliyun.com");
        properties.put("namespace", "a3b8f285-6ec3-4b0c-aa09-7dfc950cccae");

        //如果通过AK/SK访问ACM
        properties.put("accessKey", "a2fb47daacc1440bb19671362d87a126");
        properties.put("secretKey", "aOxUHojfoYv/h126Jt+82vsxOOI=");
        // 如果通过ECS实例RAM角色访问ACM
        // properties.put("ramRoleName", "$ramRoleName");

        // 如果是加密配置，则添加以下两行进行自动解密
        // properties.put("openKMSFilter", true);
        // properties.put("regionId", "$regionId");

        ConfigService.init(properties);
    }

    public static void refreshApp() {
        System.out.println("current thread pool size: " + blogCfg.getProperty("threadPoolSize"));
        System.out.println("current log level: " + blogCfg.getProperty("logLevel"));
        System.out.println("");
    }

    //测试代码
    public static void main(String[] args) {
        initAndWatchConfig();
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}

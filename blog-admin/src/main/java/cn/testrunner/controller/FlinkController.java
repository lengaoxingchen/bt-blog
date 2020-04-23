package cn.testrunner.controller;

import cn.testrunner.utils.IPUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import sun.reflect.annotation.TypeAnnotation;

import javax.servlet.http.HttpServletRequest;

/**
 * @author v_lvjichao
 */
@Controller
public class FlinkController {

    @RequestMapping("/flink")
    public String links() {
        return "flink";
    }

    @RequestMapping("/add-flink")
    public String addArticle() {
        return "add-flink";
    }

    @RequestMapping("/update-flink")
    public String updateArticle() {
        return "update-flink";
    }

}

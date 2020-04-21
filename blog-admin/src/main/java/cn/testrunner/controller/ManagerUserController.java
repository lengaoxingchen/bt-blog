package cn.testrunner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author v_lvjichao
 */
@Controller
public class ManagerUserController {
    @RequestMapping("/manager-user")
    public String managerUser() {
        return "manager-user";
    }
}

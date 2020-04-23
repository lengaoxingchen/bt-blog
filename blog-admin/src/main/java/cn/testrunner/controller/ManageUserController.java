package cn.testrunner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author v_lvjichao
 */
@Controller
public class ManageUserController {
    @RequestMapping("/manage-user")
    public String managerUser() {
        return "manage-user";
    }
}

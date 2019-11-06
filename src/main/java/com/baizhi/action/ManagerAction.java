package com.baizhi.action;

import com.baizhi.entity.Manager;
import com.baizhi.service.ManagerService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller //自动创建Action对象
@Scope(value = "prototype") //每次创建新的Action对象
public class ManagerAction extends ActionSupport {
    private Manager manager;
    private String message;
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
   @Autowired
    private ManagerService managerService;
    public Manager getManager() { return manager; }
    public void setManager(Manager manager) { this.manager = manager; }

    public String registerAction(){
        managerService.modfiyinsert(manager);
        return "registerSuccess";
    }
    public String loginAction(){
        try {
            managerService.loginManager(manager);
            return "loginSuccess";
        }catch (Exception e) {
            message = e.getMessage();
            return "loginerror";
        }

    }
}

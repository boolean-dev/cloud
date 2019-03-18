package com.tao.cloud.service.userimpl.controller;

import com.tao.cloud.service.user.service.UserFeign;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName UserController
 * @Descriiption TODO
 * @Author yanjiantao
 * @Date 2019/3/18 15:28
 **/
@Controller
public class UserController implements UserFeign {
    @Override
    @ResponseBody
    @RequestMapping(name = "/get", method = RequestMethod.GET)
    public Object get() {
        return "success";
    }
}

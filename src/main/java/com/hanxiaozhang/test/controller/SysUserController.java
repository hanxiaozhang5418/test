/**
 * Copyright (C), 2018-2018, hanxiaozhang
 * FileName: loginController
 * Author:   han
 * Date:     2018/12/3 13:19
 * Description: 登录控制器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hanxiaozhang.test.controller;


import com.hanxiaozhang.test.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 〈功能简述〉<br> 
 * 〈登录控制器〉
 *
 * @author han
 * @create 2019/5/19
 * @since 1.0.0
 */
@Slf4j
//@Controller
@RestController
@Scope("prototype")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;


    @RequestMapping(value = "/")
    public String test(){
       return sysUserService.findById("1").toString();
    }

    @RequestMapping(value = "/test")
    public String test1(){
        return "你好，1111！";
    }


}

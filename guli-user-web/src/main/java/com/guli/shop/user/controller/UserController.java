package com.guli.shop.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.guli.shop.guliapi.service.UserService;

public class UserController {
    @Reference
    UserService userService;

}

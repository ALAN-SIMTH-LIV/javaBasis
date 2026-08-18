package com.tl.module3.controller;

import com.tl.module3.service.WhatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class WhatController {

    // @Resource

    @Autowired
    private WhatService whatService;



}

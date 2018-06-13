package com.im.fenglei.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigClientController {

    @Value("${env}")
	String env;

    // test hi
	@RequestMapping("/hi")
	public String hi(){
		return env;
	}
}

package com.didispace.web;

import com.didispace.service.BlogProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.didispace.com
 *
 */
@RestController
public class HelloController {
    @Resource
    BlogProperties blogProperties;

    @RequestMapping("/hello")
    public String index() {
        return blogProperties.getDesc();
    }

}
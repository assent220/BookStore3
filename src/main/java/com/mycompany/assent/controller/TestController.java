package com.mycompany.assent.controller;

import javax.inject.Named;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author assent2
 */
@RequestMapping("/test")
@Named
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    public String test0() {
        return "test";
    }

    @RequestMapping(value = "/1", method = RequestMethod.GET)
    public String test1() {
        return "test1";
    }
}

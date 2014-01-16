/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assent.controller;

import com.mycompany.assent.domain.Author;
import com.mycompany.assent.service.ServiceAuthor;
import static com.mycompany.assent.util.ClassNameUtil.getCurrentClassName;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author assent2
 */

@Controller
public class Customer {

    final Logger logger = LoggerFactory.getLogger(getCurrentClassName());

    @RequestMapping(value = "/testTile",method = RequestMethod.GET)
    public String list(Model model) {
        logger.info("start:controller - testTile ");
        return "customer";
    }
}

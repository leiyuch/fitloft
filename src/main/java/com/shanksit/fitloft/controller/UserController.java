package com.shanksit.fitloft.controller;

import com.shanksit.fitloft.domain.User;
import com.shanksit.fitloft.repository.UserRpository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogConfigurationException;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chenleiyu on 15/11/24.
 */

@Controller
public class UserController {

    public static final org.slf4j.Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
   private UserRpository repository;
    @RequestMapping("/leo")
    private String say(){
        logger.info("dddddd");
      User user  = new User();
        user.setName("dfdf");
        System.out.println("this is");
       repository.save(user);
        return  "index";

    }
}

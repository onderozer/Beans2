package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dedeHan on 31.1.2016.
 */
@RestController
public class PageController {

    //@Autowired
   // private NotifcationService notificationService;

    @Autowired
    //private User user;

    @RequestMapping("/")
    public String home() {
        //return notificationService.toString();
        //return user.toString();
    }

}



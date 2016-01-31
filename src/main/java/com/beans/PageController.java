package com.beans;

import com.abc.foo.NotificationService;
import com.abc.foo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dedeHan on 31.1.2016.
 */
@RestController
public class PageController {

    private NotificationService notificationService;

    @Autowired
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @RequestMapping("/")
    public String home() {
        return notificationService.toString();
    }
}

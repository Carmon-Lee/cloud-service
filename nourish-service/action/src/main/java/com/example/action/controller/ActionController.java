package com.example.action.controller;


import com.example.action.service.ActionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;

@RestController
@RequestMapping("/")
public class ActionController {

    private Logger logger = LoggerFactory.getLogger(ActionController.class);
    @Autowired
    private ActionService actionService;

    @RequestMapping("/action")
    public Object action(final String username) {
        logger.info("username:{}", username);

        return actionService.doAction(new HashMap() {
            {
                put("username", username);
                put("date", new Date());
            }
        });
    }

}

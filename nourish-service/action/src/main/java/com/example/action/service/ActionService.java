package com.example.action.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ActionService {

    @HystrixCommand(fallbackMethod = "defaultAction")
    public Map<String,Object> doAction(Map<String, Object> parameters) {
        //do stuff that might fail
        if (!parameters.get("username").equals("liguang")) {
            throw new RuntimeException();
        }
        parameters.put("action", "do action");
        return parameters;
    }

    public Map<String,Object> defaultAction(Map<String, Object> parameters) {
        parameters.put("action", "defaultAction");
        return parameters;
    }
}

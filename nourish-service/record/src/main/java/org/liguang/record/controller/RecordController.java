package org.liguang.record.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RecordController {

    private Logger logger=LoggerFactory.getLogger(RecordController.class);

    @Autowired
    private Environment environment;

    @RequestMapping("/record")
    public Map<String, Object> doRecord(@RequestBody Map<String, Object> param) {
        logger.info("param:{}",param);

        param.put("record", "The action has been recorded!");
        param.put("instancePort", environment.getProperty("local.server.port"));

        logger.info("result:{}",param);
        return param;
    }
}

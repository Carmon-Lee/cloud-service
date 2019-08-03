package org.liguang.record.controller;

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

    @RequestMapping("/record")
    public Map<String, Object> doRecord(@RequestBody Map<String, Object> param) {
        param.put("record", "The action has been recorded!");
        return param;
    }
}

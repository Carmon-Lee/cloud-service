package com.example.action.remoteservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@FeignClient("recordservice")
public interface RecordServiceRm {

    @RequestMapping(method = POST, value = "/record")
    public Map<String,Object> callRecordService(@RequestBody Map<String,Object> param);
}

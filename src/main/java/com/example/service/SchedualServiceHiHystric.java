package com.example.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Xul on 2018/2/26.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

    @Override
    public String sayHiFromClientOne(@RequestParam(value = "name") String name) {
        return "hi,"+name+",error";
    }
}

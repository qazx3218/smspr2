package com.example.smspr2.service.impl;

import com.example.smspr2.service.DefaultService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class DefaultServiceImpl implements DefaultService {
    public Map<String,Object>create(Map<String,String> map) {
        Map<String, Object> Map = new HashMap<>();
        String Id= map.get("Id");
        String PassWord= map.get("Password");
        map.put("Id",Id);
        map.put("Password",PassWord);
        Map<String, Object> result = new HashMap<>();
        result.put("Result",map);
        return result;
    }

}

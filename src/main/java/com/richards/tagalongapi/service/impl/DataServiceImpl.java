package com.richards.tagalongapi.service.impl;

import com.richards.tagalongapi.dto.UserRequest;
import com.richards.tagalongapi.service.DataService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DataServiceImpl implements DataService {

    @Override
    public Map<String, String> getData(UserRequest userRequest) {
        try {
            return new HashMap<>();
        }catch (Exception ex) {
            throw new IllegalArgumentException("Wrong input");
        }
    }

    @Override
    public Map<String, String> postData(UserRequest userRequest) {
        try {
           return new HashMap<>();
        }catch (Exception ex) {
            throw new IllegalArgumentException("Wrong input");
        }
    }
}

package com.richards.tagalongapi.service;

import com.richards.tagalongapi.dto.UserRequest;

import java.util.Map;

public interface DataService {
    Map<String, String> getData(UserRequest userRequest);

    Map<String, String> postData(UserRequest userRequest);
}

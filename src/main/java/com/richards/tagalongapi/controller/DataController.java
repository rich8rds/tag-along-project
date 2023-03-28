package com.richards.tagalongapi.controller;

import com.richards.tagalongapi.dto.UserRequest;
import com.richards.tagalongapi.service.DataService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class DataController {
    private final DataService dataService;

    @GetMapping("/getData")
    public Map<String, String> getData(@Valid @RequestBody UserRequest userRequest) {
        return dataService.getData(userRequest);
    }

    @PostMapping("/postData")
    public Map<String, String> postData(@Valid @RequestBody UserRequest userRequest) {
        return dataService.postData(userRequest);
    }
}

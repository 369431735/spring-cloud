package com.lixing.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class BaseController {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}

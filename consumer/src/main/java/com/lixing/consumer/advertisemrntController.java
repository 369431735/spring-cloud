package com.lixing.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping(value="/advertisementInfo")
@RestController
public class advertisemrntController extends BaseController {
private Integer num=300;//并发数

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/{id}")
    public Result findById(@PathVariable Long id){
        MultiValueMap<String, String> requestEntity = new LinkedMultiValueMap<>();

        Result result= this.restTemplate.postForObject("http://localhost:8080/advertisementInfo/find/"+id,requestEntity,Result.class);

        return result;
    }

    @GetMapping("/findForApp")
    public Result findForApp(){
     for(int i=0;i<num;i++){
         new Thread(new Advertisement()).start();
     }

        return null;
    }

}

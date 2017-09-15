package com.lixing.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
@Component
public class Advertisement extends BaseController implements Runnable  {

    private RestTemplate restTemplate=new RestTemplate();
    public static Integer sendNum=0;//发送请求次数
    public static Integer timeOutNum=0;//超时次数

    public Long timeOut=2000L;
    @Override
    public void run() {
        while(true){
        MultiValueMap<String, String> requestEntity = new LinkedMultiValueMap<>();
        Record record=new Record("1","2","3","4","5","6");
        addSendNum();
        Long start=System.currentTimeMillis();
        Result result= this.restTemplate.postForObject("http://localhost:8080/record/findForApp",record,Result.class);
        Long end=System.currentTimeMillis();
        if(end-start>timeOut){
            addTimeOutNum(end-start);
        }}
    }

     void addSendNum(){
        sendNum++;
    }
     void addTimeOutNum(Long time){
        timeOutNum++;
        System.out.println("发送次数"+sendNum+"------------"+"超时次数"+timeOutNum+"超时时间:"+time);
    }
}

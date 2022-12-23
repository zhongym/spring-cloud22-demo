package com.example.springcloud22demo.client;

import org.springframework.stereotype.Component;

/**
 * @author zhongym
 */
@Component
public class CrmFeignClientImpl implements CrmFeignClient {

    @Override
    public String get(boolean bool) {
        return "回退啦=========================》";
    }
}

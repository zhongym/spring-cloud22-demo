package com.example.springcloud22demo.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhongym
 */
@FeignClient(name = "demo-service",
        fallback = CrmFeignClientImpl.class
)
public interface CrmFeignClient {

    @GetMapping("/demo")
    String get(@RequestParam("bool") boolean bool);
}

package net.walkersun.springcloud.feign.service.impl;

import net.walkersun.springcloud.feign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name + ",i'am feign";
    }
}

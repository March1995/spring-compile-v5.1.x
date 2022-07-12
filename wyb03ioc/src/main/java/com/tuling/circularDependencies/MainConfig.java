package com.tuling.circularDependencies;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
@ImportResource(locations = "classpath:Beans.xml")
@ComponentScan(basePackages = {"com.tuling.circularDependencies"})
public class MainConfig {

 /*   @Bean
    public InstanceA instanceA(InstanceB instanceB){
        return new InstanceA(instanceB);
    }

    @Bean
    public InstanceB instanceB(InstanceA instanceA) {
        return new InstanceB(instanceA);
    }*/
}

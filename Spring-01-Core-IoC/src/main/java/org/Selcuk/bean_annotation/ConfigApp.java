package org.Selcuk.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigApp {
    @Bean
    public FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor();
    }
    //@Bean(name = "p1")
    @Bean
    @Primary
    public PartTimeMentor partTimeMentor(){
        return new PartTimeMentor();
    }
    //@Bean(name = "p2")
    @Bean
    public PartTimeMentor partTimeMentor2(){
        return new PartTimeMentor();
    }


}

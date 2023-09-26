package org.Selcuk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "org.Selcuk")
@ComponentScan(basePackages = {"org.Selcuk.proxy","org.Selcuk.service","org.Selcuk.repository"})
public class ProjectConfig {
}

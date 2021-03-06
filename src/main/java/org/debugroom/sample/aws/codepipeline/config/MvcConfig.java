package org.debugroom.sample.aws.codepipeline.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("org.debugroom.sample.aws.codepipeline.app.web")
public class MvcConfig implements WebMvcConfigurer {
}

package com.AnnotationSpringBoot.annotation.spring.boot.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotation {
    @Value("Yash Barot")
    private String defaultName;

    @Value("${mail.host}")
    private String host;

    @Value("${java.home}")
    private String javaHome;

    @Value("${user.home}")
    private String javaHomeDirectory;

    public String getDefaultName() {
        return defaultName;
    }

    public String getHost() {
        return host;
    }

    public String getJavaHome() {
        return javaHome;
    }

    public String getJavaHomeDirectory() {
        return javaHomeDirectory;
    }
}

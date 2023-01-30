package com.example.wstutorial.configuration;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        packages("com.example.wstutorial.resource");
        // register(HelloWorldResource.class);
    }
}
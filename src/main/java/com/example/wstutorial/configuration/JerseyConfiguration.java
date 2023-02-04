package com.example.wstutorial.configuration;

import java.util.Collections;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfiguration extends ResourceConfig {

    public JerseyConfiguration() {
        // Allow Jersey to work alongside Spring Web
        property(ServletProperties.FILTER_FORWARD_ON_404, true);

        // Allow Jersey work with Spring Security
        // https://docs.spring.io/spring-boot/docs/current/reference/html/howto.html#howto.jersey.spring-security
        // FIXME: This makes Spring Web stop working
        // setProperties(Collections.singletonMap("jersey.config.server.response.setStatusOverSendError",
        // true));

        // register(HelloWorldResource.class);
        packages("com.example.wstutorial.resource");
    }

}
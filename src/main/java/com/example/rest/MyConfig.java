package com.example.rest;

import com.example.rest.web.CompteRestJaxRSAPI;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

@Configuration
public class MyConfig {
    //@Bean
    public ResourceConfig resourceConfig(){
        ResourceConfig jerseyServlet=new ResourceConfig();
        jerseyServlet.register(CompteRestJaxRSAPI.class);
        return jerseyServlet;
    }

    @Bean
    SimpleJaxWsServiceExporter serviceExporter(){
        SimpleJaxWsServiceExporter serviceExporter=new SimpleJaxWsServiceExporter();
        serviceExporter.setBaseAddress("http://0.0.0.0:8787/");
        return serviceExporter;
    }
}

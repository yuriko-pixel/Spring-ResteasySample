package com.resteasy.resteasytest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/greeting")
public class GreetingConfig extends Application{
}

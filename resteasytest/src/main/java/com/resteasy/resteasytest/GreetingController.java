package com.resteasy.resteasytest;
import java.util.concurrent.atomic.AtomicLong;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

@Component
@Path("/api/")
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GET
    @Path("{name}")
    @Consumes("application/json")
    @Produces("application/json")
    public Greeting greeting(@PathParam("name") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
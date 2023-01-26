package org.acme.srt.rest;

import java.util.UUID;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/uuid")
public class UUIDResource {

    @GET
    public String get() {
                return UUID.randomUUID().toString();
    }

}


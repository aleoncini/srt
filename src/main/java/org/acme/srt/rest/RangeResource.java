package org.acme.srt.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.acme.srt.model.Configuration;
import org.acme.srt.model.Range;

@Path("/range")
public class RangeResource {

    @Inject
    Configuration config;
    
    @GET
    @Path("/list")
    public List<Range> get(@PathParam("uuid") String uuid) {
        return config.getRanges();
    }

    @POST
    public String add(Range range) {
        config.addRange(range);
        return "Range added to configuration";
    }

}


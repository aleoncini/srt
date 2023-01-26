package org.acme.srt.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.acme.srt.model.Associate;
import org.acme.srt.model.Configuration;

@Path("/associate")
public class AssociateResource {

    @Inject
    Configuration config;
    
    @GET
    @Path("/{uuid}/list")
    public List<Associate> get(@PathParam("uuid") String uuid) {
        return config.getAssociates(uuid);
    }

    @GET
    @Path("/{uuid}/{id}")
    public Associate getAssociate(@PathParam("uuid") String uuid, @PathParam("id") String id) {
        return config.getAssociate(uuid, id);
    }

    @POST
    @Path("/{uuid}")
    public String add(@PathParam("uuid") String uuid, Associate associate) {
        config.addAssociate(uuid, associate);
        return "Associate added to configuration";
    }

    @POST
    @Path("/{uuid}/clear")
    public String clear(@PathParam("uuid") String uuid) {
        config.clearAssociates(uuid);
        return "All associates removed from configuration";
    }

}


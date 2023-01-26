package org.acme.srt.model;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Context;

import io.vertx.core.http.HttpServerRequest;

@ApplicationScoped
public class Configuration {
    private List<Range> ranges;
    private Hashtable<String, List<Associate>> associates;

    @Context
    HttpServerRequest request;

    public Configuration(){
        this.ranges = new ArrayList<Range>();
        this.associates = new Hashtable<String,List<Associate>>();
    }

    public Configuration addRange(Range range){
        ranges.add(range);
        return this;
    }

    public Configuration addAssociate(String uuid, Associate associate){
        if(associates.containsKey(uuid)){
            associates.get(uuid).add(associate);
        } else {
            ArrayList<Associate> list = new ArrayList<Associate>();
            list.add(associate);
            associates.put(uuid, list);
        }
        return this;
    }

    public void clearAssociates(String uuid){
        if(associates.containsKey(uuid)){
            associates.replace(uuid, new ArrayList<Associate>());
        }
    }

    public Range getRange(String grade){
        Range r = null;
        for (Range range : ranges) {
            if(range.grade.equals(grade)){
                r = range;
            }
        }
        return r;
    }

    public List<Range> getRanges(){
        return this.ranges;
    }

    public List<Associate> getAssociates(String uuid){
        return associates.get(uuid);
    }

    public Associate getAssociate(String uuid, String id){
        Associate associate = null;
        List<Associate> list = associates.get(uuid);
        for (Associate a : list) {
            if(a.id.equals(id)){
                associate = a;
            }
        }
        return associate;
    }
}
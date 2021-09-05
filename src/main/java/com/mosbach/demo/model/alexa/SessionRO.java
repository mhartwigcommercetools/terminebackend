package com.mosbach.demo.model.alexa;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.HashMap;
import java.util.Map;


@JsonTypeName(value = SessionRO.TYPENAME)
public class SessionRO 
{
    protected final static String TYPENAME = "SessionRO";

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    public SessionRO()
    {
        super();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    }

}

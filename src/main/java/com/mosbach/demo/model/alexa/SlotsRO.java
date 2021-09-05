package com.mosbach.demo.model.alexa;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.HashMap;
import java.util.Map;

@JsonTypeName(value = SlotsRO.TYPENAME)
public class SlotsRO
{
    protected final static String TYPENAME = "SlotRO";

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    public SlotsRO()
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

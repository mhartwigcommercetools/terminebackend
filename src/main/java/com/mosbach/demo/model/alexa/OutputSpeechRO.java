package com.mosbach.demo.model.alexa;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonTypeName(value = OutputSpeechRO.TYPENAME)
public class OutputSpeechRO
{
    protected final static String TYPENAME = "IntentRO";

    @JsonProperty("type")
    private String type;
    @JsonProperty("text")
    private String text;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    public OutputSpeechRO()
    {
        super();
    }

    public OutputSpeechRO(String type, String text)
    {
        super();
        this.type = type;
        this.text = text;
    }
    
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
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

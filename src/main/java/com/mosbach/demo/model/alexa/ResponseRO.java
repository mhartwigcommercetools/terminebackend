package com.mosbach.demo.model.alexa;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonTypeName(value = ResponseRO.TYPENAME)
public class ResponseRO
{
    protected final static String TYPENAME = "ResponseRO";

    @JsonProperty("outputSpeech")
    private OutputSpeechRO outputSpeech;
    @JsonProperty("shouldEndSession")
    private Boolean shouldEndSession;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    public ResponseRO()
    {
        super();
    }

    public ResponseRO(OutputSpeechRO outputSpeech, Boolean shouldEndSession)
    {
        super();
        this.outputSpeech = outputSpeech;
        this.shouldEndSession = shouldEndSession;
    }
    
    @JsonProperty("outputSpeech")
    public OutputSpeechRO getOutputSpeech() {
        return outputSpeech;
    }

    @JsonProperty("outputSpeech")
    public void setOutputSpeech(OutputSpeechRO outputSpeech) {
        this.outputSpeech = outputSpeech;
    }

    @JsonProperty("shouldEndSession")
    public Boolean getShouldEndSession() {
        return shouldEndSession;
    }

    @JsonProperty("shouldEndSession")
    public void setShouldEndSession(Boolean shouldEndSession) {
        this.shouldEndSession = shouldEndSession;
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

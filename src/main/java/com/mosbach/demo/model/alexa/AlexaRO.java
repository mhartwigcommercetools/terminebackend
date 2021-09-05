package com.mosbach.demo.model.alexa;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.*;

@JsonRootName(value = "TaskListRO")
public class AlexaRO
{
    protected final static String TYPENAME = "Alexa";
    
    @JsonProperty("request")
    private RequestRO request;
    @JsonProperty("response")
    private ResponseRO response;
    @JsonProperty("version")
    private String version;
    
    @JsonProperty("session")
    private SessionRO session;
    @JsonProperty("context")
    private ContextRO context;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();
    
    public AlexaRO()
    {
        super();
    }

    public AlexaRO(String version)
    {
        super();
    }
    
    @JsonProperty("request")
    public RequestRO getRequest() {
        return request;
    }

    @JsonProperty("request")
    public void setRequest(RequestRO request) {
        this.request = request;
    }
    
    @JsonProperty("response")
    public ResponseRO getResponse() {
        return response;
    }

    @JsonProperty("response")
    public void setResponse(ResponseRO response) {
        this.response = response;
    }
    
    @JsonProperty("version")
    public String getVersion() {
    return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
    this.version = version;
    }
    @JsonProperty("session")
    public SessionRO getSession() {
    return session;
    }

    @JsonProperty("session")
    public void setSession(SessionRO session) {
    this.session = session;
    }
    @JsonProperty("context")
    public ContextRO getContext() {
    return context;
    }

    @JsonProperty("context")
    public void setContext(ContextRO context) {
    this.context = context;
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


// @JsonRawValue public String version;
// private String version;
// private boolean shouldEndSession;
// private String outputSpeech;




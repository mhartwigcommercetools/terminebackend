package com.mosbach.demo.model.alexa;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;


@JsonTypeName(value = RequestRO.TYPENAME)
public class RequestRO
{
    protected final static String TYPENAME = "RequestRO";

    @JsonProperty("type")
    private String type;
    @JsonProperty("requestId")
    private String requestId;
    @JsonProperty("intent")
    private IntentRO intent;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    public RequestRO()
    {
        super();
    }

    public RequestRO(String type, String requestId, IntentRO intent, String locale, String timestamp)
    {
        super();
        this.type = type;
        this.requestId = requestId;
        this.intent = intent;
        this.locale = locale;
        this.timestamp = timestamp;
    }
 
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("requestId")
    public String getRequestId() {
        return requestId;
    }

    @JsonProperty("requestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @JsonProperty("intent")
    public IntentRO getIntent() {
        return intent;
    }

    @JsonProperty("intent")
    public void setIntent(IntentRO intent) {
        this.intent = intent;
    }

    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
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

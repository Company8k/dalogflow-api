package com.googleapis.dialogflow;

import java.util.Locale;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;

public class QueryResult {
    public String                queryText;
    public Locale                languageCode;
    public Double                speechRecognitionConfidence;
    public String                action;
    public Map<String, JsonNode> parameters;
    public Boolean               allRequiredParamsPresent;
    public String                fulfillmentText;
    public Message[]             fulfillmentMessages;
    public String                webhookSource;
    public Map<String, JsonNode> webhookPayload;
    public Context[]             outputContexts;
    public Intent                intent;
    public Number                intentDetectionConfidence;
    public Map<String, JsonNode> diagnosticInfo;
}

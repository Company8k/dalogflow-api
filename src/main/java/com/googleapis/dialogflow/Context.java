package com.googleapis.dialogflow;

import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;

public class Context {
    public String                name;
    public Number                lifespanCount;
    public Map<String, JsonNode> parameters;
}

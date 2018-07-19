package com.googleapis.dialogflow;


public class WebhookResponse {
    public String     fulfillmentText;
    public Message[]  fulfillmentMessages;
    public String     source;
    public Object     payload;
    public Context[]  outputContexts;
    public EventInput followupEventInput;
}

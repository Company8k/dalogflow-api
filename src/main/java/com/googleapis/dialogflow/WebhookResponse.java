package com.googleapis.dialogflow;

import com.fasterxml.jackson.databind.node.ObjectNode;

public class WebhookResponse {
  public String fulfillmentText;
  public Message[] fulfillmentMessages;
  public String source;
  public ObjectNode payload;
  public Context[] outputContexts;
  public EventInput followupEventInput;
}
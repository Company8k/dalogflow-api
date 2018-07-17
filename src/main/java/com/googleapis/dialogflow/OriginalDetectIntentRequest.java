package com.googleapis.dialogflow;

import com.fasterxml.jackson.databind.node.ObjectNode;


public class OriginalDetectIntentRequest {
    /** The source of this request, e.g., google, facebook, slack. It is set by Dialogflow-owned servers. */
    public String source;
    /** Optional. The version of the protocol used for this request. This field is AoG-specific. */
    public String version;
    /** Optional. This field is set to the value of QueryParameters.payload field passed in the request. */
    public ObjectNode payload;
}
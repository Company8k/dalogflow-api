package com.googleapis.dialogflow;


public class OriginalDetectIntentRequest {
    /** The source of this request, e.g., google, facebook, slack. It is set by Dialogflow-owned servers. */
    public String source;
    /** Optional. The version of the protocol used for this request. This field is AoG-specific. */
    public String version;
    /** Optional. This field is set to the value of QueryParameters.payload field passed in the request. */
    public Object payload; //TODO generic or something similar
}

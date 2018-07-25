package com.googleapis.dialogflow;


public class OriginalDetectIntentRequest extends Payload<Object>{
    /** The source of this request, e.g., google, facebook, slack. It is set by Dialogflow-owned servers. */
    public String source;
    /** Optional. The version of the protocol used for this request. This field is AoG-specific. */
    public String version;
}

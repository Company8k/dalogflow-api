package com.googleapis.dialogflow;

import java.util.Map;

public class EventInput {
    /** Required. The unique identifier of the event. */
    public String                name;
    /** Optional. The collection of parameters associated with the event. */
    public Map<String, Object> parameters;
    /** 
     * Required.
     * The language of this query. See Language Support for a list of the currently supported language codes.
     * Note that queries in the same session do not necessarily need to specify the same language.
     */
    public String                languageCode;
}

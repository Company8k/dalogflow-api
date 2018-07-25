package com.googleapis.dialogflow;

public abstract class Payload<T> {
    /** Optional. This field is set to the value of QueryParameters.payload field passed in the request. */
    public T payload; //TODO generic or something similar
}

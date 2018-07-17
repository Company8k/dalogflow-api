package com.googleapis.dialogflow;

public class Intent {
    public String               name;
    public String               displayName;
    public WebhookState         webhookState;
    public Number               priority;
    public Boolean              isFallback;
    public Boolean              mlDisabled;
    public String[]             inputContextNames;
    public String[]             events;
    public TrainingPhrase[]     trainingPhrases;
    public String               action;
    public Context[]            outputContexts;
    public Boolean              resetContexts;
    public Parameter[]          parameters;
    public Message[]            messages;
    public Platform[]           defaultResponsePlatforms;
    public String               rootFollowupIntentName;
    public String               parentFollowupIntentName;
    public FollowupIntentInfo[] followupIntentInfo;

    /**
     *  The unique identifier of this parameter. 
     */
    public class Parameter {
        /** Required. The name of the parameter. */
        public String   name;
        /**
         * Optional.
         * The definition of the parameter value. It can be:
         * - a constant string,
         * - a parameter value defined as $parameter_name,
         * - an original parameter value defined as $parameter_name.original,
         * - a parameter value from some context defined as #context_name.parameter_name.
         */
        public String   displayName;
        /** 
         * Optional. The default value to use when the value yields an empty result. Default values can be extracted from contexts by using the following syntax: #context_name.parameter_name.
         */
        public String   defaultValue;
        /**
         * Optional. The name of the entity type, prefixed with @, that describes values of the parameter. If the parameter is required, this must be provided.
         */
        public String   entityTypeDisplayName;
        /**
         * Optional. Indicates whether the parameter is required. That is, whether the intent cannot be completed without collecting the parameter value.
         */
        public Boolean  mandatory;
        /**
         * Optional. The collection of prompts that the agent can present to the user in order to collect value for the parameter.
         */
        public String[] prompts;
        /**
         * Optional. Indicates whether the parameter represents a list of values.
         */
        public Boolean  isList;
    }
}

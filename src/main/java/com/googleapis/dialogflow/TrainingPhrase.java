package com.googleapis.dialogflow;

public class TrainingPhrase {

    public enum TYPE {
        TYPE_UNSPECIFIED,
        EXAMPLE,
        TEMPLATE
    }

    public String name;
    public TYPE   type;
    public Part[] parts;
    public Number timesAddedCount;

    public class Part {
        public String  text;
        public String  entityType;
        public String  alias;
        public Boolean userDefined;
    }
}

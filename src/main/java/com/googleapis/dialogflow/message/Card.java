package com.googleapis.dialogflow.message;

public class Card {
    public String   title;
    public String   subtitle;
    public String   imageUri;
    public Button[] buttons;

    public static class Button {
        public String text;
        public String postback;
    }
}

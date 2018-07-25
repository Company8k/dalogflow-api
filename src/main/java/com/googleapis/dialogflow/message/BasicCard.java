package com.googleapis.dialogflow.message;

import java.net.URI;

public class BasicCard {
    public String   title;
    public String   subtitle;
    public String   formattedText;
    public Image    image;
    public Button[] buttons;

    public static class Button {
        public String        title;
        public OpenUriAction openUriAction;

        public static class OpenUriAction {
            public URI uri;

            public OpenUriAction(String uri) {
                this.uri = URI.create(uri);
            }
        }
    }
}

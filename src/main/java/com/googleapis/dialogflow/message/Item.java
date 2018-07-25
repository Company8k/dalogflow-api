package com.googleapis.dialogflow.message;

public class Item {
    public SelectItemInfo info;
    public String         title;
    public String         description;
    public Image          image;

    public static class SelectItemInfo {
        public String   key;
        public String[] synonyms;
    }
}

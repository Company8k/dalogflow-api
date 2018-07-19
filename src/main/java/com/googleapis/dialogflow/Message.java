package com.googleapis.dialogflow;

import java.net.URI;

public class Message {
  public Platform platform;
  public Text text;
  public class Text {
    public String[] text;
  }
  public Image image;
  public class Image {
    public URI imageUri;
    public String accessibilityText;
  }
  public QuickReplies quickReplies;
  public class QuickReplies{
    public String title;
    public String[] quickReplies;
  }
  public Card card;
  public class Card {
    public String title;
    public String subtitle;
    public String imageUri;
    public Button[] buttons;
    public class Button{
      public String text;
      public String postback;
    }
  }
  public SimpleResponse[] simpleResponses;
  public class SimpleResponse{
    public String textToSpeech;
    public String ssml;
    public String displayText;
  }
  public BasicCard basicCard;
  public class BasicCard {
    public String title;
    public String subtitle;
    public String formattedText;
    public Image image;
    public Button[] buttons;
    public class Button{
      public String title;
      public OpenUriAction openUriAction;
      public class OpenUriAction{
        public URI uri;
      }
    }
  }
  public Suggestion[] suggestions;
  public class Suggestion{
    public String title;
  }
  public LinkOutSuggestion linkOutSuggestion;
  public class LinkOutSuggestion {
    public String destinationName;
    public URI uri;
  }
  public ListSelect listSelect;
  public class ListSelect{
    public String title;
    public Item[] itmes;
  }
  public CarouselSelect carouselSelect;
  public class CarouselSelect {
    public Item[] item;
  }
  public class Item{
    public SelectItemInfo info;
    public String title;
    public String description;
    public Image image;
    public class SelectItemInfo{
      public String key;
      public String[] synonyms;
    }
  }
}
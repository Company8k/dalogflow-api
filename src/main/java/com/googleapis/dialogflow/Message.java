package com.googleapis.dialogflow;

import com.googleapis.dialogflow.message.BasicCard;
import com.googleapis.dialogflow.message.Card;
import com.googleapis.dialogflow.message.CarouselSelect;
import com.googleapis.dialogflow.message.Image;
import com.googleapis.dialogflow.message.LinkOutSuggestion;
import com.googleapis.dialogflow.message.ListSelect;
import com.googleapis.dialogflow.message.QuickReplies;
import com.googleapis.dialogflow.message.SimpleResponse;
import com.googleapis.dialogflow.message.Suggestion;
import com.googleapis.dialogflow.message.Text;

public class Message {
  public Platform platform;
  public Text text;
  public Image image;
  public QuickReplies quickReplies;
  public Card card;
  public SimpleResponseWrapper simpleResponses;
  public static class SimpleResponseWrapper{
    public SimpleResponse[] simpleResponses;
  }
  public BasicCard basicCard;
  public Suggestion[] suggestions;
  public LinkOutSuggestion linkOutSuggestion;
  public ListSelect listSelect;
  public CarouselSelect carouselSelect;
}
package org.pan;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;

import java.util.Locale;

public class LocaleDemo extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) throws Exception {
    Locale.setDefault(Locale.SIMPLIFIED_CHINESE);
    Dialog.buildConfirmation("提示", "请确认").addYesButton(new EventHandler() {
      @Override
      public void handle(Event event) {
        //nothing to do
      }
    }).build().show();
  }
}

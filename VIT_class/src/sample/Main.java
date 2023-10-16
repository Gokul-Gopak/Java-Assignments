package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.stage.Stage;
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Question 2");

        TextField b = new TextField("initial text");
        TilePane r = new TilePane();
        TextField l = new TextField("Not Inserted Value ");

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                if(b.getText().equals("CSE1007"))
                    l.setText("JAVA PROGRAMMING");
                else if(b.getText().equals("CSE3002"))
                    l.setText("IWP");
                else if(b.getText().equals("CSE2003"))
                    l.setText("DSA");
                else
                    l.setText("Not Appropriate Code");
            }
        };

        b.setOnAction(event);

        r.getChildren().add(b);
        r.getChildren().add(l);
        Scene sc = new Scene(r, 200, 200);

        primaryStage.setScene(sc);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

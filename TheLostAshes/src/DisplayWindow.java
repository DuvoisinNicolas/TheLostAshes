import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DisplayWindow extends Application
{
    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage)
    {
        // Create the Text Nodes

        Text bottomText = new Text("Bottom");


        BorderPane.setAlignment(bottomText,Pos.BOTTOM_CENTER);


        // Create a BorderPane with a Text node in each of the five regions
        BorderPane root = new BorderPane();
        root.setBottom(bottomText);
        // Set the Size of the VBox
        root.setPrefSize(400, 400);
        // Set the Style-properties of the BorderPane
        root.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");

        // Create the Scene
        Scene scene = new Scene(root);
        // Add the scene to the Stage
        stage.setScene(scene);
        // Set the title of the Stage
        stage.setTitle("A simple BorderPane Example");
        // Display the Stage
        stage.show();
    }
}
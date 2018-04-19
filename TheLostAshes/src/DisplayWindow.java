import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DisplayWindow extends Application
{
    static String myText = new String();
    static String myImg = new String();

    public static void main(String[] args)
    {
        setParams("Super ça marche","https://avatars2.githubusercontent.com/u/37442663?s=400&v=4");
        Application.launch(args);
    }

    public static void setParams(String _myText,String _myImg)
    {
        myText=_myText;
        myImg=_myImg;
    }

    @Override
    public void start(Stage stage)
    {
        Group root = new Group();
        Scene scene = new Scene(root, 800, 600, Color.YELLOW);
        stage.setScene(scene);

        Text Texte = new Text();
        Texte.setText(myText);
        Texte.setX(300);
        Texte.setY(200);
        Texte.setFill(Color.RED);
        root.getChildren().add(Texte);

        Image image = new Image("https://avatars2.githubusercontent.com/u/37442663?s=400&v=4",500,500,true,true);
        ImageView selectedImage = new ImageView();
        selectedImage.setX(250);
        selectedImage.setY(200);
        selectedImage.setImage(image);
        root.getChildren().add(selectedImage);
        stage.show();
    }


}
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

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
        Scene scene = new Scene(root, 800, 600, Color.GREY);
        stage.setScene(scene);

        Text texte = new Text(200,500,myText);
        texte.setFill(Color.RED);
        root.getChildren().add(texte);

        Rectangle rectGauche = new Rectangle(10,10,150,400);
        rectGauche.setFill(Color.TRANSPARENT);
        rectGauche.setStroke(Color.BLACK);
        rectGauche.setArcWidth(30.0);
        rectGauche.setArcHeight(20.0);
        root.getChildren().add(rectGauche);

        Rectangle rectDroite = new Rectangle(640,10,150,400);
        rectDroite.setFill(Color.TRANSPARENT);
        rectDroite.setStroke(Color.BLACK);
        rectDroite.setArcWidth(30.0);
        rectDroite.setArcHeight(20.0);
        root.getChildren().add(rectDroite);

        Rectangle rectBas = new Rectangle(10,420,780,170);
        rectBas.setFill(Color.TRANSPARENT);
        rectBas.setStroke(Color.BLACK);
        rectBas.setArcWidth(30.0);
        rectBas.setArcHeight(20.0);
        root.getChildren().add(rectBas);


        Image image = new Image(myImg,400,400,true,true);
        ImageView selectedImage = new ImageView();
        selectedImage.setX(200);
        selectedImage.setY(10);
        selectedImage.setImage(image);
        root.getChildren().add(selectedImage);

        Text stats = new Text(20,50,"Stats:\nForce : \nAgilité : \nHP :");
        stats.setFill(Color.RED);
        root.getChildren().add(stats);


        stage.show();
    }


}
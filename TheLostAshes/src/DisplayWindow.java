import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import static java.lang.String.valueOf;

public class DisplayWindow extends Application
{
    private static String myText , myImg = new String();
    private Character myHero;


    public static void main(String[] args)
    {
        setParams("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris euismod purus ut urna ultrices tristique. Donec euismod mattis pulvinar. Nulla volutpat rutrum purus, ac porttitor neque ","https://avatars2.githubusercontent.com/u/37442663?s=400&v=4");
        setText(myText);
        Application.launch(args);
    }

    public static String setText (String texte)
    {
        char[] charArray= texte.toCharArray();
        int charCpt=0;
        int endlCpt=0;
        for (int i=0 ; i < charArray.length ; ++i)
        {
            ++charCpt;
            if (charArray[i] == ' ' && charCpt >= 100)
            {
                charArray[i] = '\n';
                charCpt = 0;
                ++endlCpt;
                if (endlCpt>=5)
                    throw new ArrayIndexOutOfBoundsException("Trop de sauts de ligne");
            }
        }
        return valueOf(charArray);
    }

    private static void setParams(String _myText,String _myImg) {
        myText = _myText;
        myImg = _myImg;
        try
        {
            myText = setText(myText);
        }
        catch (ArrayIndexOutOfBoundsException a)
        {
        System.err.println("Erreur , string trop longue");
        }
    }

    @Override
    public void start(Stage stage)
    {

        Group root = new Group();
        Scene scene = new Scene(root, 800, 600, Color.GREY);
        stage.setScene(scene);

        // Ajout du texte

        Text texte = new Text(50,450,myText);
        texte.setFill(Color.RED);
        root.getChildren().add(texte);

        Text stats = new Text(20,50,"Nom: "+ myHero.getMyName() +"\n \nAttaque : \n \nDéfense : \n \nHP :");
        stats.setFill(Color.RED);
        root.getChildren().add(stats);

        // Ajout des Rectangles
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

        stage.show();
    }


}
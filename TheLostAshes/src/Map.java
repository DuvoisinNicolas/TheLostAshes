import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Map {

    private String myEntree , mySortie , myFileName, myTexte;


    public Map(String Entree , String Sortie) throws IOException {

        {
        myEntree=Entree;
        mySortie=Sortie;
        myFileName="TheLostAshes/files/" + myEntree + '_' + mySortie;
        myTexte = new String(Files.readAllBytes(Paths.get(myFileName)));
    }


    }
    public String getMyEntree()
    {
        return myEntree;
    }

    public String getMySortie()
    {
        return mySortie;
    }

    public String getMyFileName()
    {
        return myFileName;
    }

    public String getMyTexte()
    {
        return myTexte;
    }

}
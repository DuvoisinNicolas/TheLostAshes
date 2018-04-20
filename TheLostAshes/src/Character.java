public class Character {

    private int myAtk,myDef,myHp;
    private String myName;

    public Character()
    {
        myName="Hero";
        myAtk=3;
        myDef=0;
        myHp=5;
    }

    public String getMyName() {
        return myName;
    }

    public int getMyAtk() {
        return myAtk;
    }

    public int getMyDef() {
        return myDef;
    }

    public int getMyHp() {
        return myHp;
    }
}

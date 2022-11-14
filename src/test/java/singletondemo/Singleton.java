package singletondemo;
//Singleton class is created to make one object...In selenium We use to create the object of database only one
public class Singleton {
    private Singleton()
    {

    }

    private static Singleton instance;

    public static Singleton getInstance()
    {
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }

}

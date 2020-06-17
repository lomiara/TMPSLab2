package TMPS.Proxy;

public class Client {
    public void example(){
        System.out.println("Proxy");
        DataBase db = DatabaseConnectionProxy.getInstance();
        db.newUser("name","password");
        System.out.print('\n');
    }
}

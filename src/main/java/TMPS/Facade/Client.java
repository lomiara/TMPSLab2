package TMPS.Facade;

public class Client {
    public void example(){
        System.out.println("Facade");
        String myText = "Encrypt this text";
        EncryptorFacade e= new EncryptorFacade();
        System.out.println("MD5 encryption");
        System.out.println(e.encrypt("MD5", myText));
        System.out.println("SHA encryption");
        System.out.println(e.encrypt("SHA", myText));
        System.out.println("SHA256 encryption");
        System.out.println(e.encrypt("SHA256", myText));
    }
}

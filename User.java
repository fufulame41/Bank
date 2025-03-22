import java.io.Serializable;
import java.util.Scanner;

public abstract class User implements HasMenu, Serializable{
    private String userName;
    private String PIN;
    private Scanner scanner = new Scanner(System.in);

    public User(){
        this.userName = "";
        this.PIN = "";
    }

    public User(String userName, String PIN){
        this.userName = userName;
        this.PIN = PIN;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getPIN(){
        return PIN;
    }

    public void setPIN(String PIN){
        this.PIN = PIN;
    }

    public boolean login(){
        System.out.println("Enter username:");
        String inputUserName = scanner.nextLine();
        System.out.println("Enter PIN:");
        String inputPIN = scanner.nextLine();

        return login(inputUserName, inputPIN);
    }

    public boolean login(String userName, String PIN){
        return this.userName.equals(userName) && this.PIN.equals(PIN);
    }

    public abstract String getReport();

    @Override
    public abstract String menu();

    @Override
    public abstract void start();
}

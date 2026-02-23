package var;

public class Main {
    public static void main(String[] args) {
    String name = "Ansh";
    int gta = 6;
    double pi = 3.14159;
    char gender = 'M';
    boolean isAdmin = true;
    
    System.out.println("Hello my name is " + name + ".\nI am wating for GTA" + gta + ".\nMy gender is " + gender + ".\nThe value of pi is " + pi);
    if(isAdmin){
        System.out.println(name + " is a admin");
    }
    else{
        System.out.println(name + " is not a admin");
    }
    }
}
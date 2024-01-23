import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter Your Name");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.print("Your Initials are "+name.charAt(0));
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==' '){
                System.out.print(name.charAt(i+1));
            }
        }

    }
}
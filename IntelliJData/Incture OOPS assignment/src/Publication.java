import java.util.Scanner;

public class Publication {
    private String title;
    private float price;

    public Publication(){
        title="";
        price=0;
    }

    public void get_data(){
        System.out.println("Enter Title");
        Scanner sc=new Scanner(System.in);
        String temp=sc.nextLine();
        title=temp;
        System.out.println("Enter Price");
        float x=sc.nextFloat();
        price=x;
    }
    public void put_data(){
        System.out.println("_*_______*_");
        System.out.println("Title of Book is "+title);
        System.out.println("Price of Book is "+ price);
    }
}

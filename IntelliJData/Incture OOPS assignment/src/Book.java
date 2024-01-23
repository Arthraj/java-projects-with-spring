import java.util.Scanner;

public class Book extends Publication{
    private int pageCount=0;
    public Book(){
        pageCount=0;
    }

    public void getData(){
        Publication:get_data();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Pages Count");
        int pages=sc.nextInt();
        pageCount=pages;
    }

    public void putData(){
        Publication:put_data();
        try {
            if (pageCount < 0) {
                throw new InstantiationException();
            }
        }
        catch (InstantiationException e){
            System.out.println("Error: Page Count = "+e);
            pageCount=0;
        }
        System.out.println("Pages are "+pageCount);
    }
}

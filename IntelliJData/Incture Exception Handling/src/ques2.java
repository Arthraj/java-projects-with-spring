import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) throws myException {
        System.out.println("Enter Marks");
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();

        if(marks>=0 && marks<=100){
            System.out.println("Marks are:"+marks);
        }
        else{
            throw new myException("Marks not in range 0 to 100");
        }
    }
}

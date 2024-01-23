import java.util.Scanner;

public class que05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.nextLine();
        int n=str.length();

        int[] hash=new int[256];

        for(int i=0;i<n;i++){
            hash[str.charAt(i)]++;
        }
        System.out.print("Duplicates are:");
        for(int i=0;i<n;i++){
            if(hash[str.charAt(i)]>1){
                hash[str.charAt(i)]=0;
                System.out.print(str.charAt(i));
            }
        }

    }
}

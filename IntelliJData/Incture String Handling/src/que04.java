import java.util.Scanner;

public class que04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String s=sc.nextLine();

//        Check for palindrome
        if(checkPalindrome(s)){
            System.out.println(s+" is a Palindrome");
        }
        else{
            System.out.println(s+" is not a Palindrome");
        }
    }

    public static boolean checkPalindrome(String str){

        int n=str.length();
        if(n==0)return false;

        int left=0,right=n-1;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

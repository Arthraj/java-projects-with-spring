import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book [] b=new Book[20];
        Tape [] t=new Tape[20];

        int ch=0,bC=0,tC=0;
        do{
            System.out.println("1. Add Book");
            System.out.println("2. Add Tape");
            System.out.println("3. Display Book");
            System.out.println("4. Display Tape");
            System.out.println("5. Exit");
            Scanner sc=new Scanner(System.in);

                ch=sc.nextInt();

                switch(ch){
                    case 1:{
                        System.out.println("_*_______*_");
                        System.out.println("Adding Book");
                        b[bC]=new Book();
                        b[bC].getData();
                        bC++;break;
                    }
                    case 2:{
                        System.out.println("_*_______*_");
                        System.out.println("Adding Tape");
                        t[tC]=new Tape();
                        t[tC].getData();
                        tC++;break;
                    }
                    case 3:{
                        System.out.println("_*_______*_");
                        System.out.println("Displaying all Books");
                        for(int i=0;i<bC;i++){
                            b[i].putData();
                        }
                        break;
                    }
                    case 4:{
                        System.out.println("_*_______*_");
                        System.out.println("Displaying all Tapes");
                        for(int i=0;i<tC;i++){
                            t[i].putData();
                        }
                        break;
                    }
                    case 5:{
                        System.out.println("Program Exited");
                        break;
                    }
                    default:
                        System.out.println("fuckk");
                        break;
                }
        }while(ch!=5);
//        eof
    }
}
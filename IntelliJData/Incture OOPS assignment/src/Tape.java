import java.util.Scanner;

public class Tape extends Publication {
    private float playingTime;

    public Tape(){
        playingTime=0;
    }

    public void getData(){
        Publication:get_data();
        System.out.println("Enter playing time");
        Scanner sc=new Scanner(System.in);
        float p=sc.nextFloat();
        playingTime=p;
    }

    public void putData(){
        Publication:put_data();
        try{
            if(playingTime<0) throw new InstantiationException();
        }
        catch (InstantiationException f){
            System.out.println("Playtime Error "+f);
            playingTime=0;

        }
        System.out.println("Playing Time is: "+playingTime);
    }
}

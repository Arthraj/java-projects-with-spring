public class Main {

    static void fun() throws IllegalAccessException
    {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }
    public static void main(String[] args) {
//        Use of throws keyword

        try {
            fun();
        }
        catch (IllegalAccessException e) {
            System.out.println("caught in main.");
        }
        System.out.println("Succesfully completed execution without hault during Runtime.");
    }
}
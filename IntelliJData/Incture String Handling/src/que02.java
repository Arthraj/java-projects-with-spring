public class que02 {
    public static void main(String[] args) {
        String s1="Incture";
        String s2="Tech";

//        First way , simply concatenating two string using addition operator.
        String s3=s1+" "+s2;
        System.out.println(s3);

//        Second way, using concat() of Stirng class
        String s4=s1.concat(" ").concat(s2);
        System.out.println(s4);

//        Thrid way, using join()

        String s5=String.join(" ",s1,s2);
        System.out.println(s5);
    }
}

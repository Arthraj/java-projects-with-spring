public class ques3 {
//    Chained Exception
    public static void main(String[] args)
    {
        try
        {
            // Creating an exception
            ArithmeticException excep = new ArithmeticException("Exception of Arithmetic type");

            // Setting a cause of the exception
            excep.initCause(new NumberFormatException(
                    "This is actual cause of the exception"));

            // Throwing an exception with cause.
            throw excep;
        }

        catch(ArithmeticException excep)
        {
            // displaying the exception
            System.out.println(excep);

            // Getting the actual cause of the exception
            System.out.println(excep.getCause());
        }
    }
}

package module2.week1.practice;

public class Question3 {

    // convert integer to string without using built in method
    public static void convert(String s)
    {

        // Initialize a variable
        int num = 0;
        int n = s.length();

        // Iterate till length of the string
        for(int i = 0; i < n; i++)

            // Subtract 48 from the current digit
            num = num * 10 + ((int)s.charAt(i) - 48);

        // Print the answer
        System.out.print(num);
    }

    // Driver code
    public static void main(String[] args)
    {
        // Given string of number
        String s = "123";

        // Function Call
        convert(s);
    }
}

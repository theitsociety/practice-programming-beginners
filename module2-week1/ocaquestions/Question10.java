package module2.week1.ocaquestions;

public class Question10 {
    public static void main(String[] args){

    }
}

/*
*       10. Which of the following are legal entry point methods that can be run from the command
        line? (Choose all that apply)
        A. private static void main(String[] args) - invalid - private
        B. public static final main(String[] args)
        C. public void main(String[] args)
        D. public static void test(String[] args)
        E. public static void main(String[] args)
        F. public static main(String[] args)
        G. None of the above.
*
* */




































/*
* Option E is the canonical main() method signature.
A is incorrect since the main() method must be public.
B and F are incorrect because the main() method must have a void return type.
C is incorrect because the main() method must be static.
D is incorrect because the main() method must be named main.
Please also note that

static public void main(String[] argv)
and
public static void main(String[] argv)
are both good entry point, which means the public and static can be switched.
* */
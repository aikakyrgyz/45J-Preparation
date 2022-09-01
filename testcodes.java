
/*
import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        /*
        String greet = "HI";
        String name = "Aika";
        String nn = name.substring(0, 3);
        if (nn == name.substring(0, 3))
            System.out.println("has real nn");
        else if (greet + name == greet + nn)
            System.out.println("no real nickname");
        else
            System.out.println("hmmmm");
        */

        /*
        int sum = 0;
        int i = 1;
        while (i<5) {
            sum = sum + i;
            i++;

        }
        System.out.println(i);
        System.out.println(sum);
        */


        // QUESTION 12

        /*
        String S = "";
        String T = "";
        int i = 4;
        for (i =1; i<=3; i++)
            S = S + "!";
        for (i = 1; i< 4; i++)
            T = T + "*";
        System.out.print(S);
        System.out.println(T);

         // QUESTION 13
        */

        // int answer = 5;
        // switch (answer)
        // {
        //     case 0:         System.out.println("0 entered"); break;
        //     case 1:         System.out.println("1 entered"); break;
        //     case 3:         System.out.println("3 entered"); break;
        //     case 5:         System.out.println("5 entered"); break;
        //     default:         System.out.println("Other value entered");
        // }
        // int answer = 0;
        // if ((answer >=1 && answer <=5 &&  answer % 2 == 1)|| (answer == 0))
        //     System.out.println(answer + " entered");
        // else
        //     System.out.println(answer);


        // int answer = 9;
        // if (answer == 1)
        // System.out.println("1 entered");
        //     if (answer == 3)
        //         System.out.println("3 entered");
        //         if (answer == 5)
        //             System.out.println("5 entered");
        //             if (answer == 0)
        //                 System.out.println("0 entered");
        //                 if (answer != 0 && answer != 1 && answer != 3 && answer !=5)
        //                     System.out.println("OTHER");



        // Question 24, 25





// }}
/*
import java.util.*;

public class MyClass {
        private int value;

        public int getInt() {
            return value;
        }

        public void setInt(int newValue) {
            value = newValue;
        }

        public static void main(String args[]) {

            MyClass p;
            p = new MyClass();
            MyClass q = new MyClass();
            q.setInt(20);
            p.setInt(q.getInt());       // line 1
            System.out.println(q.getInt());
            System.out.println(p.getInt());
            p.setInt(15);
            q = p; // line 2
            System.out.println(q.getInt());
            System.out.println(p.getInt());
            p = null;
            System.out.println(p.getInt());

        }
}
*/
import java.util.*;

public class MyClass {
            public static void main(String args[]) {
                int [2] nums = {1, 2};
                try {
                    int c = 10/0;
                }
                catch (ArithmeticException e) {
                    return;
                }
                finally {
                    int d = nums[4];
                }
}}

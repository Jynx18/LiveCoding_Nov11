
package com.mycompany.livecoding_nov11_problem3;
import java.util.Scanner;

public class LiveCoding_Nov11_Problem3 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       input.useDelimiter("[^0-9-]+");
       
        int n = input.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        // Gi-fix nga base case: 1 ang i-return imbes nga 0
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

//Why did one wrong return make every result wrong?
// Answer: kay sa gi hatag ni sir na code iyaha gi return to zero so maapil sa factorial ang zero imbis
//3*2*1 lang ang e multiply naapil nuon ang 0 mao to namali ang code kay imbis 6 ang answer kay gi multiply mn 
//sa zero edi na zero.

//Stretch: what happens for factorial(-2) with your corrected code, and
//why?
//Answer: if tawagon ang factorial(-2) mo return gyapun siya sa 1 kay imbis mag crash siya ang naka butang mn sa code
// kay if less than or equals to negative 1 kay mo return sa into 1 so mo return ra siya sa 1 without crashing
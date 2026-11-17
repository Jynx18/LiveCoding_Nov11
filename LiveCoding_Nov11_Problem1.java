
package com.mycompany.livecoding_nov11_problem1;

import java.util.Scanner;

public class LiveCoding_Nov11_Problem1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("[^0-9-]+");
        
        int a = input.nextInt();
        int b = input.nextInt();
        double result = computeAverage(a,b);
        
        System.out.println(result);
    }
    
    public static double computeAverage(int total, int count){
        if(count <= 0){
            return 0.0;
        }
        return (double) total/count;
    }
}

// Why does the method need the word double (or a cast) in the return?
//Answer: kay para ang result mo gawas nga naay decimal, kay kung int lang ang
// kay kung int lang imoha gi butang dira, mawala ang decimal na dapat apil sa result.

//What would go wrong without the count <= 0 guard?
//Answer: first palang bawal gyd mag divide if ang denominator is zero so dapat e zero gyd siya
// and naay dako nga possibilities na mag crash ang imoha gi code kay bawal mn gyd e divide og 0
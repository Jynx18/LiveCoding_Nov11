/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.livecoding_nov11_problem2;
import java.util.Scanner;
public class LiveCoding_Nov11_Problem2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String rawInput = input.nextLine();
        String[] parts = rawInput.split("}");
        
        String line = parts[0].replace("{", "").replace(" ", "");
        int a = Integer.parseInt(parts[1].replace(",", "").replace(" ", ""));
        
        int[] values;
        if(line.isEmpty()){
            values = new int[0];
        } else{
            String[]number = line.split(",");
            values = new int[number.length];
            for (int i = 0; i < number.length; i++) {
                values[i]=Integer.parseInt(number[i]);
            }
        }
        
        String markPart = parts[1].replace(",", "").replace(" ", "");
        int passingMark = Integer.parseInt(markPart);
        
        int result = countPassingRecursive(values, a, 0);
        
        System.out.println(result);
    }
    
    public static int countPassing(int[]grades, int passingMark){
        int count = 0;
        
        for (int i = 0; i < grades.length; i++) {
            if(grades[i]>= passingMark){
                count++;
            }
        }
        return count;
    }
    
    public static int countPassingRecursive(int[]grades, int passingMark, int index){
        if (index >= grades.length){
            return 0;
        }
        
        if (grades[index] >= passingMark){
            return 1 + countPassingRecursive(grades,passingMark,index + 1);
        } else {
            return countPassingRecursive(grades,passingMark,index + 1);
        }
    }
}

//What does each recursive call do to index, and why must it change?
// Answer; kay para mo proceed siya sa next grade nga imoha gi input maong mag change siya para
// maabot niya ang kinalasan nga grade sa imohang gi input. kay if dili ang program or ang imoha gi code 
// kay ma stuck sa siya didto sa isa ka grade or sa pinaka unang grade nga imohang gi input hantud mag crash nalang

//What happens if you delete the base case entirely?
//Answer: if wala ang base case ang method wala kabalo kung kanus a siya mag stop and
// sge rana siya og balik balik hantud mag crash nalang ang imoha gi program
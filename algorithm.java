package Haxxor;
import java.util.*;

public class algorithm{

     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] problems = new String[5];
        problems[0] = "Differentiate x. Enter the number that corresponds to the right solution. \n Option 1: 1 \n Option 2: x^2 \n Option 3: 2x \n Option 4: x^2/2";
        problems[1] = "Differentiate 2x^2. Enter the number that corresponds to the right solution. \n Option 1: 4x \n Option 2: x \n Option 3: 2x^3 \n Option 4: 2x^3/3";
        problems[2] = "Differentiate x^7. Enter the number that corresponds to the right solution. \n Option 1: 7x^6 \n Option 2: x^6 \n Option 3: 7x^7 \n Option 4: x^8/8";
        problems[3] = "Differentiate 1/x. Enter the number that corresponds to the right solution. \n Option 1: -1/x^2 \n Option 2: 1/x^2 \n Option 3: 1/x \n Option 4: logx";
        problems[4] = "Differentiate 6x^3-9x. Enter the number that corresponds to the right solution. \n Option 1: 18x^2 - 9 \n Option 2: x^2-9 \n Option 3: x^2 \n Option 4: 3/2x^4 - 9x^2/2";

        
        int input = 0;
        int practise_prob_count = 1;
        int problem_num = 0;
        while(practise_prob_count > 0 && problem_num != problems.length){
            try{
                System.out.println(problems[problem_num]);
                input = scan.nextInt();
                scan.nextLine();
                if(input == 1){
                    System.out.println("Correct! ");
                    practise_prob_count--;
                } else if (input == 2){
                    System.out.println("Wrong. Let's help you practise! ");
                    practise_prob_count += 1;
                } else if (input == 3){
                    System.out.println("Wrong. Let's help you practise! ");
                    practise_prob_count += 2;
                } else if (input == 4){
                    System.out.println("Wrong. Let's help you practise! ");
                    practise_prob_count += 3;
                } else {
                    System.out.println("Please enter a valid integer number between 1 and 4.");
                } 
                problem_num++;
            } catch(InputMismatchException e){
                System.out.println("Please enter an integer value.");
                scan.nextLine();
            }
        }



        

        


      
    }


}
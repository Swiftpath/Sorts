
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Dominic
 */
public class Sort {

    /**
     * @param args the command line arguments
     */
    List<Integer> ints = new ArrayList<Integer>();
        
    public Sort() {
            System.out.println("begin sort enter your nums");
            Scanner in = new Scanner(System.in);
            int input = in.nextInt();
            while (input <= 50 && input >= 0){
                ints.add(input);
                input = in.nextInt();
            }
            histoInt();
            
          }
    
        
        public void histoInt(){
            int counter;
            for(int k = 0; k <=50; k++){
                System.out.print(k + ": ");
                counter = 0;
                for (Integer x : ints){
                        if (x.equals(k)){
                            counter++;
                        }
                        
                }
              System.out.print(counter + "\n");  
            }
        public void SelectionSort (int[] num) {
        int i, j, first, temp;  
        for ( i = num.length - 1; i > 0; i--)  
        {
          first = 0;   
          for(j = 1; j <= i; j ++)   
          {
               if( num[ j ] < num[ first ] )         
                 first = j;
          }
          temp = num[first];   
          num[ first ] = num[i];
          num[i] = temp; 
            }          
        }
     
}
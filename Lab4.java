/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4;

import java.util.Scanner;

/**
 *
 * @author TrayTray
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int j,sum = 0,smallest=101,largest=-1;

         double avg;

        System.out.println(" Please enter ten integers between 1 and 100 ");
        
        for(int i=0;i<10;i++){
            j = sc.nextInt();
            sum+=j;
            
            if(j<smallest){
                smallest = j;
            }
            if(j>largest){
                largest = j;
                
            }
            
            
        }
        
        avg = (double)sum/10;

        System.out.println("Smallest: "+smallest);

        System.out.println("Largest: "+largest);

        System.out.println("Average: "+avg);
    }
    
}

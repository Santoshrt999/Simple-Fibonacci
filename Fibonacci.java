/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Santosh Goteti
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    
    public static int Fibonaci(int n){
    if(n<=1){
    return n;
    }else{
    return Fibonaci(n-1) + Fibonaci(n-2);
    
    }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        for(int i=0; i<10; i++){
        
            System.out.println(i + " Fibonnaci " + Fibonaci(i));
        }
       // System.out.println(Fibonaci(10));
    }
    
}

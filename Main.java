import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    
       
       Scanner scn  = new Scanner(System.in);
          int n  = scn.nextInt();


          int N = 2*n-1 ;

          for(int i =0 ; i<N ; i++){

              for(int j=0 ; j<N ; j++){

                  int val = Math.min(Math.min(i , j ) , Math.min(N-i-1 , N-j-1));

                  System.out.print(n-val + "\t");
              }
              System.out.println();
          }



 }

}
package kosegenmatris;

import java.util.Scanner;

/**
 *
 * Created by AhmetHakanAksu
 */
public class KosegenMatris {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("matrisin boyutunu giriniz:");
        int boyut= s.nextInt();
            
            for(int i=0; i<boyut; i++){
                for(int x=0; x<boyut; x++){
                    if(i==x)
                    System.out.print("1");
                    else
                        System.out.print("0");
                }
                System.out.println();
            }
        
            }
   }

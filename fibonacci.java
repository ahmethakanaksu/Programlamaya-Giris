package fibonacci;

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Fibonacci serisinin ilk kaç elemanını görmek istersiniz:");
        int sayi= s.nextInt();
        
        int a= 1, b=1;
        int c;
        System.out.println(a);
        System.out.println(b); //ilk 2 fibonacci sayısı tanımdan dolayı 1 1 olmalı onları kendimiz yazdırıyoruz
        for(int i=0; i<sayi-2; i++) { // 2 tanesini zaten yazdırdığımız için sayi-2 yazdık
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
            
        
    }
}

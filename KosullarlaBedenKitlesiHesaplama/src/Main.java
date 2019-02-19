
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Berkay
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kilonuzu Giriniz: ");
        int kilo=scanner.nextInt();
        System.out.print("Boyunuzu Giriniz(örnek: 1,88) : ");
        double boy=scanner.nextDouble();
        
        double kitle=(kilo/(boy*boy));
        
        if (kitle<18.5) {
            
            System.out.println("Zayıfsınız.");
            
        }
        
        else if (kitle>=18.5&&kitle<=25) {
            
            System.out.println("Normalsiniz.");
            
        }
        
        else if (kitle>=25&&kitle<=30) {
            
            System.out.println("Kilolusunuz.");
            
        }
        
        else if (kitle>30) {
            
            System.out.println("Obezsiniz!");
            
        }
        
        
    }
    
}

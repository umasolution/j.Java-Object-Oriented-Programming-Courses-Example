/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_69;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_69 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tara = new Scanner(System.in);
        new_class hesapla_1 = new new_class();
        System.out.println(hesapla_1.en);
        new_class hesapla_2 = new new_class(4);
        System.out.println(hesapla_2.en);
        new_class hesapla_3 = new new_class(4, 3);
        System.out.println(hesapla_3.en);
        System.out.println(hesapla_3.boy);
    }
    
}

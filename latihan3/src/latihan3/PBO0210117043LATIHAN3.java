/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

import java.util.Scanner;
/**
 *
 * @author nama  : yusrizal falahan
 *         kelas : if2
 *         nim   : 10117043
 */

public class PBO0210117043LATIHAN3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("masukkan nama anda: ");
        
        //inisialisai objek scaner
        Scanner scanner = new Scanner(System.in);
        
        //menyimpan hasil masukkan
        String nama = scanner.next();
        
        System.out.println("nama anda adalah: " + nama);
    }
    
}

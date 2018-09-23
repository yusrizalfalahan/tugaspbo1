/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author nama  : yusrizal falahan
 *         kelas : if2
 *         nim   : 10117043
 */
public class kambing {

    public void tambahkambing(){
    //deklarasi variabel lokal
    int jumlahkambing = 0;
    
    jumlahkambing = jumlahkambing + 5;
        System.out.println("jumlah kambing setelah ditambah: " + jumlahkambing);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        kambing kambingjantan = new kambing();
        
        kambingjantan.tambahkambing();
    }
    
}

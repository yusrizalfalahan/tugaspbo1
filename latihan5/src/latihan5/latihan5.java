/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5;

/**
 *
 * @author nama  : yusrizal falahan
 *         kelas : if2
 *         nim   : 10117043
 */
public class latihan5{
    
// variaabel jumlah kambing menjadi variabel instance
int jumlahkambing = 88;

//method untuk menampilakn jumalah kambing
public void getjumlahkambing(){
    System.out.println("jumlah kambing: " + jumlahkambing);
    
}
public void tambahkambing(){
    jumlahkambing = jumlahkambing + 1;
    System.out.println("jumlah kambing setelah ditambah: " + jumlahkambing);
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   latihan5 kambingjantan = new latihan5();
   
   //menampilkan jumlah kambing yang ada saat program pertama x berjalan
   kambingjantan.getjumlahkambing();
   //menambah satu kambing
   kambingjantan.tambahkambing();
   //menampilkan jumlah kambing yang ada
   kambingjantan.getjumlahkambing();
   
    }
    
}

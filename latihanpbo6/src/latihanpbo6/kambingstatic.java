/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo6;

/**
 *
 * @author nama  : yusrizal falahan
 *         kelas : if2
 *         nim   : 10117043
 */
public class kambingstatic {
    //NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING ="MIDUN";
    
    public static void main(String[] args) {
        mamalia.jumlahkambing = 485000;
        System.out.println(NAMA_KAMBING + "memiliki kambing sebanyak" +
                mamalia.jumlahkambing);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l5.kambingglobal;

/**
 ** NAMA  : Radit Muharom
 * NIM   : A2.1900138
 * Kelas : TI-1C
 * 
 * @author raditmuharom
 */
public class L5Kambingglobal {
    //Variabel jumlahkambing menjadi variabel intance
    
    int jumlahKambing = 88;
    
    //Method untuk menampilkan jumlah kambing
    public void getJumlahKambing (){
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: "+ jumlahKambing);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       L5Kambingglobal kambingSusu = new L5Kambingglobal();
       
       //Menampilkan jumlah kambing yang ada saat program pertama x berjalan
       kambingSusu.getJumlahKambing();
       
       //Menambah satu kambing
       kambingSusu.tambahKambing();
       
       //Menambahkan jumlah kambing yang ada
       kambingSusu.getJumlahKambing();
    }
    
}

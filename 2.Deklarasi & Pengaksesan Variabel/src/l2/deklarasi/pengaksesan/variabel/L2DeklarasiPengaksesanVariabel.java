/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2.deklarasi.pengaksesan.variabel;

/**
 ** NAMA  : Radit Muharom
 * NIM   : A2.1900138
 * Kelas : TI-1C
 * 
 * @author raditmuharom
 */
public class L2DeklarasiPengaksesanVariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi variabel
        int nilaiInt;
        final double PHI = 3.14;//Konstanta uppr\ercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        //Memberi nilai ke variabel 
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        //Menampilkan hasil
        System.out.println();
        System.out.println("Isi variabel Nilai = " + nilaiInt);
        System.out.println("Isi variabel PHI = " + PHI);
        System.out.println("Isi variabel logika = " + nilaiLogika);
        System.out.println("Isi variabel Karakter = " + nilaiKarakter);
    }
    
}

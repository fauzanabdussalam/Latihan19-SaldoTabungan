/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k_10119901_latihan19_saldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author
 * NAMA     : Fauzan Muhammad Abdussalam
 * KELAS    : IF-10K
 * NIM      : 10119901
 * Deskripsi Program : Menghitung Saldo Tabungan
 *
 */
public class PBO10K_10119901_Latihan19_SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat kursIndonesia     = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp   = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp.");
        formatRp.setMonetaryDecimalSeparator('.');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        int saldoAwal       = 2500000;
        int bungaPerBulan   = 15;
        int lamaBulan       = 6;
        String saldoString;

        for (int i = 1; i <= lamaBulan; i++) 
        {
            saldoAwal   = saldoAwal + (saldoAwal * bungaPerBulan / 100);

            saldoString = String.format("%s", kursIndonesia.format(saldoAwal));

            saldoString = saldoString.substring(0, saldoString.length() - 3);

            System.out.println("Saldo di bulan ke-" + i + " " + saldoString);
        }
    }
    
}

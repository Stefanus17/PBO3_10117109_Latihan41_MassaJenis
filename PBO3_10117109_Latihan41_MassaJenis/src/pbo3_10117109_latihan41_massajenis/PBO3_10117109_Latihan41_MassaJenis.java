/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan41_massajenis;

import java.util.Scanner;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : PBO3
 * Deskripsi Program  : Program ini berisi program untuk menampilkan 
 * hasil volume dan massa jenis kubus
 */
public class PBO3_10117109_Latihan41_MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner (System.in);
        Kubus kbs = new Kubus();
        
        System.out.println("========Massa Jenis Kubus========");
        System.out.print("Sisi : ");
        kbs.setSisi(keyboard.nextInt());
        System.out.print("Massa : ");
        kbs.setMassa(keyboard.nextInt());
        
        System.out.println("\n"+"========Hasil Perhitungan========");
        System.out.println("Volume : " + kbs.hitungVolume(kbs.getSisi()));
        System.out.println("Massa Jenis : " 
                + kbs.hitungMassaJenis(kbs.getMassa(), 
                        kbs.hitungVolume(kbs.getSisi())));
    }
    
}

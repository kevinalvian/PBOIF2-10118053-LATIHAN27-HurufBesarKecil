/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118053.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class PBOIF210118053LATIHAN27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Kalimat : ");
        String huruf = input.nextLine();
        
        String hurufBesar = huruf.toUpperCase();
        String hurufKecil = huruf.toLowerCase();

        System.out.println("=====Hasil Formating=====");
        System.out.println("huruf besar: " + hurufBesar);
        System.out.println("huruf kecil: " + hurufKecil);
        System.out.println("(Developed by : Kevin Alvian)");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan59.detectiveconan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 *                     kata-kata bijak tokoh film detective conan
 * 
 */
public class PBO210118071Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        Tokoh t = new Tokoh();
        
        // tampilin menu
        t.displayTokoh();
        
        // input pilihan menu
        t.getPilih(input.nextInt());
    }
}

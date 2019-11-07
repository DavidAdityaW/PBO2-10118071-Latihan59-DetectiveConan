/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan59.detectiveconan;

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
public class Tokoh extends KataBijak {
     public void displayTokoh() {
        System.out.println("#***********************************************#");
        System.out.println("#***Cek Kata Bijak Tokoh Film Detective Conan***#");
        System.out.println("1. Conan Edogawa");
        System.out.println("2. Shinichi Kudo");
        System.out.println("3. Genta Kojima");
        System.out.println("#************************************************#");
        System.out.print("Choose (1/2/3): ");     
    }
     
    public void getPilih(int pilihTokoh) {
        switch (pilihTokoh) {
            case 1:
                System.out.println();
                System.out.println("Walaupun tubuhku mengecil, tapi otakku tidak dan Kebenaran hanya ada satu");
                System.out.println("-Conan Edogawa");
                break;
            case 2:
                System.out.println();
                System.out.println("Segala sesuatu itu mempunyai pola, bahkan benang kusut sekalipun");
                System.out.println("-Shinichi Kudo");
                break;
            case 3:
                System.out.println();
                System.out.println("Jadi orang dewasa jangan suka mengingkari janji, Ibuku yang bilang begitu");
                System.out.println("-Genta Kojima");
                break;
            default:
                break;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

/**
 *
 * @author buket.genc
 */
public class TelefonBayi {

    public static void main(String[] args) {
        S8Fabrikasi s8Fabrikasi = new S8Fabrikasi();
        Telefon s8=s8Fabrikasi.getTelefon("s8", "2600mah", 4, 7);

        Note8Fabrikasi note8Fabrikasi = new Note8Fabrikasi();
        Telefon note8=note8Fabrikasi.getTelefon("note8", "3600mah", 5, 8);
        
        System.out.println(s8);
        System.out.println(note8);
    }
}

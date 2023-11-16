/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author buket.genc
 */
public class TelefonBayi {

    public static void main(String[] args) {

        Telefon s8 = TelefonFabrikasi.getTelefon("s8", "2600mah", 4, 7);
        Telefon note8 = TelefonFabrikasi.getTelefon("note8", "3600mah", 5, 8);
        System.out.println(s8.toString());
        System.out.println(note8.toString());

    }
}

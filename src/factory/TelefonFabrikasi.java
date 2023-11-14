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
public class TelefonFabrikasi {

    public static Telefon getTelefon(String model, String batarya, int en, int boy) {
        Telefon telefon;
        if ("S8".equalsIgnoreCase(model)) {
            telefon = new S8(model, batarya, en, boy);
        } else if ("Note8".equalsIgnoreCase(model)) {
            telefon = new Note8(model, batarya, en, boy);
        } else {
            throw new RuntimeException("Geçerli bir model değildir.");
        }
        return telefon;
    }
}

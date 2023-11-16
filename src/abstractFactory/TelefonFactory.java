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
public interface TelefonFactory {

    Telefon getTelefon(String model, String batarya, int en, int boy);
}

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
public class S8Fabrikasi implements TelefonFactory{

    @Override
     public  Telefon getTelefon(String model, String batarya, int en, int boy) {
        Telefon telefon= new S8(model, batarya, en, boy);
        return telefon;
    }
    
}

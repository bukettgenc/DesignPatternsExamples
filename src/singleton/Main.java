/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author buket.genc
 */
public class Main {
      public static void main(String[] args) {
        //10 kere dönmesine rağmen nesne sadece bir kere oluşur
        //Şuanda kullanılmasa bile nesne oluşuyor. Bu yüzden lazy loading yapmamız lazım.
        for (int i = 0; i < 10; i++) {
            Singleton singleton = Singleton.getSingleton();
        }

    }
}

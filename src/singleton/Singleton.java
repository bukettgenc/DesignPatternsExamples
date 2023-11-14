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
public class Singleton {
    //getSingleton çalışınca nesne oluşması için newlemenin yeri değişti
    //  private static Singleton singleton = new Singleton();

    private static Singleton singleton;
    private static int sayi = 0;

    public Singleton() {
        System.out.println("Nesne oluştu");
    }

    public static Singleton getSingleton() {
        //multithread olursa aynı anda getSingleton çalışırsa iki kere nesne oluşmasını engellemek için synchronized ekledik
        //eğer singleton null değilse boş yere synchronize çalışmasın diye bir kontrol daha eklendi
        //double checked locking
        if (singleton == null) {
        synchronized(Singleton.class){
        if (singleton == null) {
            singleton = new Singleton();
        }}
}
        sayi++;
        System.out.println("sayi:" + sayi);
        return singleton;
    }

}

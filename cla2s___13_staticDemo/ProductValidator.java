/*
koşulları sınıyoruz değeri poztif olacak ve isim boş olmayacak 
 */
package cla2s___13_staticDemo;

public class ProductValidator {
    //burada static ile void arasında ki fark 
    // static çalışması için class çalışması yeterli 
    //public  (class ile aynı isimde olması gerek)  çalışması için new lemek gerekmektedir

    static {// buranın çalışması için bu classın çalışması yeterlidir  
        System.out.println("merhaba");
    }

    public ProductValidator() {// buranın çalışması için  clasın başka bir yerde newlenmesi gerekmektedir   
        System.out.println("yapıcı blok çalışıyor");
    }

    public static boolean isValid(Product product) {
        System.out.println(product.price); //ücretini yazdırdık 
        if (product.price > 0 && product.name!=null ) { //ücretinin 0 dan daha büyük olacak ve ismi boş küme olmayacak 
            return true;

        } else {
            return false;
        }

    }
}
//!product.name.isEmpty()
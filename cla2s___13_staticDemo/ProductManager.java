/*
ürünü veri tabanına eklemek için kulanıyoruz bunu 
 */
package cla2s___13_staticDemo;

/**
 *
 * @author Lenovo
 */
public class ProductManager {

    public static void add(Product product) {
        // product türünden bilgi istedik 

        if (ProductValidator.isValid(product)) {
            //kulanıcıdan alacak olduğumuz product bilgisini productvalidator da kıyasladık isValid metodunda inceledik    
            System.out.println("EKLENDİ");
            // burada veri tabanına bağlantı yapmamız gerekmektedir 
            
        } else {
            System.out.println("Ürün bilgileri geçersizdir .");
        }

    }
}

/*
static konusunu işliyoruz
 */
package cla2s___13_staticDemo;

public class NewMain {

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price = 10; //fiyatı 10 tl olsun 
        product.id = 14;//id si 14 olsun
        product.name = "Ahmet";//ismi ahmet olsun 
        manager.add(product);//buradanda veri tabanına ekledik 
    }

}

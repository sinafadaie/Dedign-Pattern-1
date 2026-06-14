package iterator.excersize;

import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        Product product1 = new Product(1, "product1");
        Product product2 = new Product(2, "product2");
        Product product3 = new Product(3, "product3");

        ProductCollection products = new ProductCollection();
        products.add(product1);
        products.add(product2);
        products.add(product3);

        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()){
            Product product = iterator.next();
            System.out.println(product);
        }

    }
}

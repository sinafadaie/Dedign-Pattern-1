package iterator.excersize;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductCollection implements Iterable<Product> {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }


  @Override
  public Iterator<Product> iterator() {
    return new ListIterator();
  }

  private class ListIterator implements Iterator<Product>{
    private int counter;  //its 0 at first
                          //because it's primitive

    @Override
    public boolean hasNext() {
        return counter < products.size();
    }

    @Override
    public Product next() {
      return products.get(counter++);
    }
  }
}

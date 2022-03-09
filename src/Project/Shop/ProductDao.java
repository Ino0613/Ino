package Project.Shop;

import Project.Shop.entity.Product;

import java.util.List;

public interface ProductDao {

    public void add(Product p);
    public List<Product> findAll();
    public Product findById(int id);

}

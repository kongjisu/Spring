package ecommerce.Ecommerce.Product.ProductService;

import ecommerce.Ecommerce.Product.ProductModel.Product;
import ecommerce.Ecommerce.Product.ProductRepository.ProductRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdectServiceImpl implements ProductService{

   @Autowired
   private ProductRepositoryJPA productRepositoryJPA;

    @Override
    public Product addProduct(Product product) {
        return productRepositoryJPA.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepositoryJPA.findAll();
    }

    @Override
    public Optional<Product> getProduct(Long id) {
        return Optional.ofNullable(productRepositoryJPA.findById(id)).get();
    }
}

package ecommerce.Ecommerce.Product.ProductRepository;

import ecommerce.Ecommerce.Product.ProductModel.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositoryJPA extends JpaRepository<Product, Long> {
}

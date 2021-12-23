package ecommerce.Ecommerce.Product.ProductService;

import ecommerce.Ecommerce.Product.ProductModel.Product;
import ecommerce.Ecommerce.User.UserModel.User;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product addProduct(Product product);
    List<Product> getAllProduct();
    Optional<Product> getProduct(Long id);

}


//public interface UserService {
//    User addUser(User user);
//    List<User> getAllUser();
//    Optional<User> getUser(Long id);
//
//}
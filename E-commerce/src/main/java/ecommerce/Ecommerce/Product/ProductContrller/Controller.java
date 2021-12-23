package ecommerce.Ecommerce.Product.ProductContrller;

import ecommerce.Ecommerce.Product.ProductService.ProductService;
import ecommerce.Ecommerce.User.UserService.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class Controller {

    @Autowired
    private ProductService productService;

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public User add(){

        return null;
    }
}


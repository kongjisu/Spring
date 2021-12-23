package ecommerce.Ecommerce.Product.ProductModel;

import ecommerce.Ecommerce.base.UtilTimeSetter;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public  class Product extends UtilTimeSetter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String userEmail;

}
//public class Product {
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long ProductId;
//    private String ProductName;
//    private int Price;
//    private int Size;
//    private int Wight;
//    private String Color;
//
//}





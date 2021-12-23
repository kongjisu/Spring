package ecommerce.Ecommerce.User.UserDto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data

public class IUser {
        private Long id;
        private int password;
        private String userName;
        private int userPhoneNumber;
        private String userAddress;
        private String userEmail;


    }
//아직까지...IPOST 어떻게 하는지 모르것누..

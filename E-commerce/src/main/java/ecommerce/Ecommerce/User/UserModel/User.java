package ecommerce.Ecommerce.User.UserModel;

import ecommerce.Ecommerce.base.UtilTimeSetter;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity

public class User extends UtilTimeSetter {//GenerationType.IDENTITY <-이 부분 참고 했음
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //id는 프라이메리키 입니다.
    private Long id;
    private int password;
    private String userName;
    private int userPhoneNumber;
    private String userAddress;
    private String userEmail;
//모르는 부분이랑 릴레이션 일대다 전부하기
    //bulider알아보자




}

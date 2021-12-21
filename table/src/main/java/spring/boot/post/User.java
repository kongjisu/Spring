package spring.boot.post;

import lombok.*;

import javax.persistence.*;
//@ToString // 밑에 있는 것들을 출력해줌
//@Getter
//@Setter//컨스트럭터까지 만들어줌

@Data //모든 생성자가 들어가 있음

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String loginId;
    @Column(name="name" , length = 20)
    private String userName;
    private String password;
    private String email;
    private String address;
    private String birth;
    private String phone;
    private String legDate;


    public User(String loginId, String userName, String password, String email, String address, String birth, String phone, String legDate) {
        this.loginId = loginId;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.address = address;
        this.birth = birth;
        this.phone = phone;
        this.legDate = legDate;
    }

    public User() {
//lombook쓰는게 좋음

    @Builder


    }
}

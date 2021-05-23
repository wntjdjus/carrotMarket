package mocarim.mocarim.domain.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class User {

    @Id
    private String userId;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String useYn;

    @Column(nullable = false)
    private String creater;

    @Column(nullable = false)
    private LocalDateTime creationDate;

    @Column(nullable = false)
    private String modifier;

    @Column(nullable = false)
    private LocalDateTime modifyDate;

    @Builder
    public User(String userId, String nickname, String address, int age, String gender, String useYn, String creater, LocalDateTime creationDate, String modifier, LocalDateTime modifyDate) {
        this.userId = userId;
        this.nickname = nickname;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.useYn = useYn;
        this.creater = creater;
        this.creationDate = creationDate;
        this.modifier = modifier;
        this.modifyDate = modifyDate;
    }
}

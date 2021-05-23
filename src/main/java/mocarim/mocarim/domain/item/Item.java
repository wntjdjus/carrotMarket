package mocarim.mocarim.domain.item;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import mocarim.mocarim.domain.user.User;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer itemNo;

    @Column(nullable = false)
    private String itemNm;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private String salesFlag;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private LocalDateTime registerDate;

    @Column(nullable = false)
    private String creater;

    @Column(nullable = false)
    private LocalDateTime creationDate;

    @Column(nullable = false)
    private String modifier;

    @Column(nullable = false)
    private LocalDateTime modifyDate;

    @Builder
    public Item(Integer itemNo, String itemNm, User user, String title, String description, String image, String salesFlag, String category, LocalDateTime registerDate, String creater, LocalDateTime creationDate, String modifier, LocalDateTime modifyDate) {
        this.itemNo = itemNo;
        this.itemNm = itemNm;
        this.user = user;
        this.title = title;
        this.description = description;
        this.image = image;
        this.salesFlag = salesFlag;
        this.category = category;
        this.registerDate = registerDate;
        this.creater = creater;
        this.creationDate = creationDate;
        this.modifier = modifier;
        this.modifyDate = modifyDate;
    }

    public void update(String itemNm){
        this.itemNm = itemNm;
    }
}

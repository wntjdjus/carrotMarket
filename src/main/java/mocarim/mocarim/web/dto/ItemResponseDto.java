package mocarim.mocarim.web.dto;

import lombok.Getter;
import mocarim.mocarim.domain.item.Item;
import mocarim.mocarim.domain.user.User;

import java.time.LocalDateTime;

@Getter
public class ItemResponseDto {

    private Integer itemNo;
    private String itemNm;
    private User user;
    private String title;
    private String description;
    private String image;
    private String salesFlag;
    private String category;
    private LocalDateTime registerDate;
    private String creater;
    private LocalDateTime creationDate;
    private String modifier;
    private LocalDateTime modifyDate;

    public ItemResponseDto(Item entity) {
        this.itemNo = entity.getItemNo();
        this.itemNm = entity.getItemNm();
        this.user = entity.getUser();
        this.title = entity.getTitle();
        this.description = entity.getDescription();
        this.image = entity.getImage();
        this.salesFlag = entity.getSalesFlag();
        this.category = entity.getCategory();
        this.registerDate = entity.getRegisterDate();
        this.creater = entity.getCreater();
        this.creationDate = entity.getCreationDate();
        this.modifier = entity.getModifier();
        this.modifyDate = entity.getModifyDate();
    }
}

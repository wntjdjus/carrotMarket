package mocarim.mocarim.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import mocarim.mocarim.domain.item.Item;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class ItemSaveRequestDto {

    private Integer itemNo;
    private String itemNm;
    private String userId;
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

    @Builder
    public ItemSaveRequestDto(Integer itemNo, String itemNm, String userId, String title, String description, String image, String salesFlag, String category, LocalDateTime registerDate, String creater, LocalDateTime creationDate, String modifier, LocalDateTime modifyDate) {
        this.itemNo = itemNo;
        this.itemNm = itemNm;
        this.userId = userId;
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

    public Item toEntity(){
        return Item.builder()
                .itemNo(itemNo)
                .itemNm(itemNm)
                .title(title)
                .description(description)
                .image(image)
                .salesFlag(salesFlag)
                .category(category)
                .registerDate(registerDate)
                .creater(creater)
                .creationDate(creationDate)
                .modifier(modifier)
                .modifyDate(modifyDate)
                .build();
    }
}

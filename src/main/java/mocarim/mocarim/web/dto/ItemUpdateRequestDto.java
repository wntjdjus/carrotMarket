package mocarim.mocarim.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ItemUpdateRequestDto {

    private String itemNm;

    @Builder
    public ItemUpdateRequestDto(String itemNm) {
        this.itemNm = itemNm;
    }
}

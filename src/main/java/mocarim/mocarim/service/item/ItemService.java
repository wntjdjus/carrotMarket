package mocarim.mocarim.service.item;

import lombok.RequiredArgsConstructor;
import mocarim.mocarim.domain.item.Item;
import mocarim.mocarim.domain.item.ItemRepository;
import mocarim.mocarim.web.dto.ItemResponseDto;
import mocarim.mocarim.web.dto.ItemSaveRequestDto;
import mocarim.mocarim.web.dto.ItemUpdateRequestDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ItemService {

    private final ItemRepository itemRepository;

    @Transactional
    public int save(ItemSaveRequestDto requestDto){
        return itemRepository.save(requestDto.toEntity()).getItemNo();
    }

    @Transactional
    public int update(int itemNo, ItemUpdateRequestDto requestDto){
        Item item = itemRepository.findById(itemNo)
                .orElseThrow(() -> new IllegalArgumentException("해당 상품이 없습니다. itemNo="+itemNo));
        item.update(requestDto.getItemNm());
        return itemNo;
    }

    public ItemResponseDto findById(int itemNo){
        Item entity = itemRepository.findById(itemNo)
                .orElseThrow(() -> new IllegalArgumentException("해당 상품이 없습니다. itemNo="+itemNo));
        return new ItemResponseDto(entity);
    }

    public List<ItemResponseDto> findByCategory(String category){

        List<Item> items = itemRepository.findByCategory(category);
        int itemSize = items.size();
        if(itemSize == 0){
            return null;
        }
        List<ItemResponseDto> dtos = new ArrayList<>();
        for(int i = 0; i < itemSize; i++){
            ItemResponseDto dto = new ItemResponseDto(items.get(i));
            dtos.add(dto);
        }
        return dtos;
    }

    public List<ItemResponseDto> findAll(){

        List<Item> items = itemRepository.findAll();
        int itemSize = items.size();
        if(itemSize == 0){
            return null;
        }
        List<ItemResponseDto> dtos = new ArrayList<>();
        for(int i = 0; i < itemSize; i++){
            ItemResponseDto dto = new ItemResponseDto(items.get(i));
            dtos.add(dto);
        }
        return dtos;
    }

}

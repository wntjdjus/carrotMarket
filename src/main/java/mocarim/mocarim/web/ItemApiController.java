package mocarim.mocarim.web;

import lombok.RequiredArgsConstructor;
import mocarim.mocarim.service.item.ItemService;
import mocarim.mocarim.web.dto.ItemResponseDto;
import mocarim.mocarim.web.dto.ItemSaveRequestDto;
import mocarim.mocarim.web.dto.ItemUpdateRequestDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ItemApiController {

    private final ItemService itemService;

    @GetMapping("/test")
    public String test(){
        return "hello";
    }

    @PostMapping("/item")
    public int save(@RequestBody ItemSaveRequestDto requestDto){

        return itemService.save(requestDto);
    }

    @PutMapping("/item/{itemNo}")
    public int update(@PathVariable int itemNo, @RequestBody ItemUpdateRequestDto requestDto){

        return itemService.update(itemNo, requestDto);
    }

    @GetMapping("/item/{itemNo}")
    public ItemResponseDto findById(@PathVariable int itemNo){

        return itemService.findById(itemNo);
    }

    @GetMapping("/items/{category}")
    public List<ItemResponseDto> findByCategory(@PathVariable String category){

        return itemService.findByCategory(category);
    }

    @GetMapping("/items")
    public List<ItemResponseDto> findAll(){

        return itemService.findAll();
    }
}

package mocarim.mocarim.web;

import lombok.RequiredArgsConstructor;
import mocarim.mocarim.service.item.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final ItemService itemService;

    @GetMapping("/")
    public String index(Model model){

        model.addAttribute("items", itemService.findAll());

        return "index";
    }
}

package com.maksim2335.tacocloud.Controller;

import com.maksim2335.tacocloud.Model.TacoOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Slf4j
@Controller
@RequestMapping("/orders")
@SessionAttributes("tacoOrder")
public class OrderController {

    @ModelAttribute
    public void addIngredientsToModel(Model model) {
        model.addAttribute("attribute",
                null);
    }

    @GetMapping("/current")
    public String orderForm() {
        int i = 1;
        return "orderForm";
    }

    @PostMapping
    public String processOrder(TacoOrder order,
                               SessionStatus sessionStatus) {
        log.info("Order submitted: {}", order);
        sessionStatus.setComplete();
        return "redirect:/design";
    }
}

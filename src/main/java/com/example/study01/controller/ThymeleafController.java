package com.example.study01.controller;

import com.example.study01.domain.ItemDTO;
import com.example.study01.domain.ItemSellStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

// 타임리프 컨트롤러
@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {
    @GetMapping("/ex1")
    public String ex1(Model model) {
        model.addAttribute("data", "스프링 부트 시작합니다.");
        return "thymeleaf/ex1";
    }

    @GetMapping("/ex2")
    public String ex2(Model model) {
        ItemDTO itemDTO = ItemDTO.builder()
                .itemDetail("상품 상세 설명")
                .itemName("상품명")
                .price(10000)
                .itemSellStatus(ItemSellStatus.SELL)
                .stockNumber(100)
                .regTime(LocalDateTime.now())
                .updateTime(LocalDateTime.now())
                .build();

        model.addAttribute("data", itemDTO);
        return "thymeleaf/ex2";
    }
}

package com.securityex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {
    @GetMapping("/myCards")
    public String sayCardsDetails() {
        return "DB에서 가져온 카드 상세 정보들";
    }

}

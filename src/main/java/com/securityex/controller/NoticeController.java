package com.securityex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeController {

    @GetMapping("/notices")
    public String getNotices() {
        return "DB에서 가져온 공지사항 세부 내용들";
    }
}

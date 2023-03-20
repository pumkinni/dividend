package com.example.dividend.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")
public class CompanyController {

    // 자동 완성 기능을 위한 키워드 조회
    @GetMapping("/autocomplete")
    public ResponseEntity<?> autocomplete(@RequestParam String keyword) {
        return null;
    }

    // 회사 리스트 조회
    @GetMapping
    public ResponseEntity<?> searchCompany() {
        return null;
    }

    // 배당금 정보 저장
    @PostMapping
    public ResponseEntity<?> addCompany() {
        return null;
    }

    // 배당금 정보 삭제
    @DeleteMapping("/company")
    public ResponseEntity<?> deleteCompany() {
        return null;
    }

}

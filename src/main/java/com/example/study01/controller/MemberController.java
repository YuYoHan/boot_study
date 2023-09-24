package com.example.study01.controller;

import com.example.study01.domain.MemberDTO;
import com.example.study01.service.MemberService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Log4j2
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/")
    public ResponseEntity<?> signUp(@RequestBody MemberDTO memberDTO) throws Exception{
        try {
            ResponseEntity<?> responseEntity = memberService.signUp(memberDTO);
            return ResponseEntity.ok().body(responseEntity);
        } catch (Exception e) {
            throw new Exception();
        }
    }
}

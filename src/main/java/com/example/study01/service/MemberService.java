package com.example.study01.service;

import com.example.study01.domain.MemberDTO;
import com.example.study01.entity.MemberEntity;
import com.example.study01.repository.MemberRepositroy;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepositroy memberRepositroy;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    // 회원가입
    public ResponseEntity<?> signUp(MemberDTO memberDTO) {
        MemberEntity findMember = memberRepositroy.findByEmail(memberDTO.getEmail());

        if(findMember == null) {
            MemberDTO member = MemberDTO.builder()
                    .email(memberDTO.getEmail())
                    .passwrod(bCryptPasswordEncoder.encode(memberDTO.getPasswrod()))
                    .userName(memberDTO.getUserName())
                    .role(memberDTO.getRole())
                    .build();

            log.info("member : " + member);
            return ResponseEntity.ok().body(member);
        } else {
            log.info("이미 가입된 회원이 있습니다.");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("이미 가입된 회원이 있습니다.");
        }
    }
}

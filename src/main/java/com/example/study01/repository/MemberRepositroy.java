package com.example.study01.repository;

import com.example.study01.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepositroy extends JpaRepository<MemberEntity, Long> {
    MemberEntity findByEmail(String email);
}

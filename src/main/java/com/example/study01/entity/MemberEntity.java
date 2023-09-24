package com.example.study01.entity;

import com.example.study01.domain.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "member")
@Table
@Getter
@NoArgsConstructor
public class MemberEntity {
    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String email;
    private String password;
    private String userName;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String provider;
    private String providerId;

    @Builder
    public MemberEntity(Long id, String email, String password, String userName, Role role, String provider, String providerId) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.userName = userName;
        this.role = role;
        this.provider = provider;
        this.providerId = providerId;
    }
}

package com.example.objectteamproject.domain;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;
@Entity
@Getter
@Setter
public class Users {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "memberId",length = 20,nullable = false)
    private String memberId;
    @Column(length = 64, nullable = false)
    private String pw;
    @Column(length = 20, nullable = false)
    private String name;
    @Column(nullable = false)
    private Sex sex;
    @Column(nullable = false)
    private LocalDateTime birthDay;
    @Column(length = 20, nullable = false)
    private String phoneNumber;
    @Column(length = 100)
    private String profileImgUrl;
    @Column(length = 255)
    private String eMail;

    private float temperauter;
    @Column(length = 255)
    private String field;
    @Column(length = 255)
    private String grade;
    @Column(length = 50, nullable = false)
    private String nickname;

    @OneToOne
    @JoinColumn(name = "memberId")
    private MemberAddresses memberAddresses;

}

package com.example.objectteamproject.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class MemberAddresses {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "memberId",length = 20, nullable = false)
    private String MemberId;
    @Column(length = 20, nullable = false)
    private String sido;
    @Column(length = 20, nullable = false)
    private String sigungu;
    @Column(length = 20, nullable = false)
    private String eupmyendong;
    @Column(length = 50, nullable = false)
    private String roadName;
    @Column(length = 20)
    private String buildingNumber;
    @Column(length = 10, nullable = false)
    private String zipCode;
    @Column(length = 50, nullable = false)
    private String subBuildingNumber;

    @OneToOne
    @JoinColumn(name = "memberId")
    private Users users;
}

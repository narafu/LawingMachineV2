package com.lawingmachinev2.app.entity;

import lombok.Data;
import org.hibernate.annotations.Comment;

import javax.persistence.*;

@Entity
@Data
@Table(name = "USER_INFO")
public class UserInfo extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "userInfo_id")
    private int id;

    @Column(length = 50)
    @Comment("사용자 아이디")
    private String userId;

    @Column(length = 50)
    @Comment("사용자 이름")
    private String userNm;

    @Column(length = 100)
    @Comment("비밀번호")
    private String password;

    @Column(length = 50)
    @Comment("닉네임")
    private String nickname;

    @Column(length = 100)
    @Comment("이메일")
    private String email;

    @Column(length = 20)
    @Comment("핸드폰 번호")
    private String mobile;

    @Column(length = 10)
    @Comment("멤버십 코드")
    private String membershipCd;

    @Column(length = 20)
    @Comment("권한")
    private String role;

    @Column(length = 4)
    @Comment("로그인 횟수")
    private int loginCnt;

    @Column(length = 50)
    @Comment("수험번호")
    private String examTicketNo;

    @Column(length = 100)
    @Comment("수험표 이미지 경로")
    private String examTicketPath;
}

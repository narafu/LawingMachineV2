package com.lawingmachinev2.app.entity;

import lombok.Data;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "CODE_MASTER_INFO")
public class CodeMasterInfo extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "codeMasterInfo_id")
    private int id;

    @OneToMany(mappedBy = "codeMasterInfo")
    private List<CodeDtlInfo> codeDtlInfoList = new ArrayList<>();

    @Column(length = 10)
    @Comment("그룹코드")
    private String grpCd; // 001: exam, 002: subject, 003: board, 004: admin, 005: membership ...

    @Column(length = 20)
    @Comment("그룹코드명")
    private String grpNm;

    @Comment("순서")
    private int srtNo;

    @Column(length = 1)
    @Comment("사용 여부")
    private char useYn = 'Y'; // Y, N

}

package com.lawingmachinev2.app.entity;

import lombok.Data;
import org.hibernate.annotations.Comment;

import javax.persistence.*;

@Entity
@Data
@Table(name = "CODE_DTL_INFO")
public class CodeDtlInfo extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "codeDtlInfo_id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codeMasterInfo_id")
    private CodeMasterInfo codeMasterInfo;

    @Column(length = 10)
    @Comment("상세코드")
    private String dtlCd; // 10, 20, 99 ...

    @Column(length = 20)
    @Comment("상세코드명")
    private String dtlNm;

    @Comment("순서")
    private int srtNo;

    @Column(length = 1)
    @Comment("사용 여부")
    private char useYn = 'Y';

}

package com.lawingmachinev2.app.entity;

import lombok.Data;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

@Data
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class BaseEntity extends BaseTimeEntity {

    @CreatedBy
    @Column(length = 20, updatable = false)
    @Comment("등록자 아아디")
    private String registerId;

    @Column(length = 20)
    @Comment("등록자 이름")
    private String registerNm;

    @LastModifiedBy
    @Column(length = 20)
    @Comment("수정자 아이디")
    private String modifyId;

    @Column(length = 20)
    @Comment("수정자 이름")
    private String modifyNm;

    @Column(length = 1)
    @Comment("삭제 여부")
    private char delYn = 'N';

}

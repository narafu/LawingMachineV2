package com.lawingmachinev2.app.entity;


import lombok.Data;
import org.hibernate.annotations.Comment;

import javax.persistence.*;

@Entity
@Data
@Table(name = "BOARD_LIKES")
public class BoardLikes extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "boardLikes_id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "boardMasterInfo_id")
    private BoardMasterInfo boardMasterInfo;

    @Column(length = 1)
    @Comment("좋아요 여부")
    private char likeYn = 'N';
}

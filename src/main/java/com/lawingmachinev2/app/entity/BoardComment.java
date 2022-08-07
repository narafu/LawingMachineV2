package com.lawingmachinev2.app.entity;

import lombok.Data;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "BOARD_COMMENT")
public class BoardComment extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "boardComment_id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "boardMasterInfo_id")
    private BoardMasterInfo boardMasterInfo;

    @OneToMany(mappedBy = "parent")
    private List<BoardComment> child = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private BoardComment parent;

    @Comment("댓글 내용")
    private String content;

    @Comment("사용자 아이디")
    private String userId;

}

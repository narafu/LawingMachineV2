package com.lawingmachinev2.app.entity;

import lombok.Data;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "BOARD_MASTER_INFO")
public class BoardMasterInfo extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "boardMasterInfo_id")
    private int id;

    @OneToMany(mappedBy = "boardMasterInfo")
    private List<BoardComment> boardCommentList = new ArrayList<>();

    @OneToMany(mappedBy = "boardMasterInfo")
    private List<BoardLikes> boardLikesList = new ArrayList<>();

    @OneToMany(mappedBy = "boardMasterInfo")
    private List<BoardViews> boardViewsList = new ArrayList<>();

    @Column(length = 10)
    @Comment("게시판 타입 코드")
    private String boardTypeCd;

    @Column(length = 10)
    @Comment("과목 코드")
    private String subjectTypeCd;

    @Column(length = 50)
    @Comment("제목")
    private String title;

    @Comment("내용")
    private String content;

    @Column(length = 1)
    @Comment("공지 여부")
    private char noticeYn = 'N';

}

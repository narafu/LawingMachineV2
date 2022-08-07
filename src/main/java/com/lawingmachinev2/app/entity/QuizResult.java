package com.lawingmachinev2.app.entity;

import lombok.Data;
import org.hibernate.annotations.Comment;

import javax.persistence.*;


@Entity
@Data
@Table(name = "QUIZ_RESULT")
public class QuizResult extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "quizResult_id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quizMasterInfo_id")
    private QuizMasterInfo quizMasterInfo;

    @Comment("사용자 아이디")
    private String userId;

    @Comment("정답 갯수")
    private int resultCnt;
}

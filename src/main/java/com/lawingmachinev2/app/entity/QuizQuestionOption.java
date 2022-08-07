package com.lawingmachinev2.app.entity;

import lombok.Data;
import org.hibernate.annotations.Comment;

import javax.persistence.*;


@Entity
@Data
@Table(name = "QUIZ_QUESTION_OPTION")
public class QuizQuestionOption extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "quizQuestionOption_id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quizQuestion_id")
    private QuizQuestion quizQuestion;

    @Comment("선택지(보기) 번호")
    private int srtNo;

    @Comment("선택지(보기) 내용")
    private String content;

    @Comment("선택지(보기) 해설")
    private String commentary;

}

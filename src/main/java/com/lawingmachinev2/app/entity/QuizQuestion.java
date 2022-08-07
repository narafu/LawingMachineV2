package com.lawingmachinev2.app.entity;

import lombok.Data;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@Table(name = "QUIZ_QUESTION")
public class QuizQuestion extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "quizQuestion_id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quizMasterInfo_id")
    private QuizMasterInfo quizMasterInfo;

    @OneToMany(mappedBy = "quizQuestion")
    private List<QuizQuestionOption> quizQuestionOptionList = new ArrayList<>();

    @Comment("문제 순서")
    private int srtNo;

    @Comment("문제 내용")
    private String content;

    @Comment("답")
    private String answer;

    @Comment("문제해설")
    private String commentary;
}

package com.lawingmachinev2.app.entity;

import lombok.Data;
import org.hibernate.annotations.Comment;

import javax.persistence.*;


@Entity
@Data
@Table(name = "QUIZ_USER_ANSWER_OPTION")
public class QuizUserAnswerOption extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "quizUserAnswerOption_id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quizUserAnswer_id")
    private QuizUserAnswer quizUserAnswer;

    @Column(length = 1)
    @Comment("선택지(보기) 소거 여부")
    private char eraseYn = 'N';

}

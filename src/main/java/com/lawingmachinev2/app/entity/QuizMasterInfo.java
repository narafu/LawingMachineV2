package com.lawingmachinev2.app.entity;

import lombok.Data;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "QUIZ_MASTER_INFO")
public class QuizMasterInfo extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "quizMasterInfo_id")
    private int id;

    @OneToMany(mappedBy = "quizMasterInfo")
    private List<QuizQuestion> quizQuestionList = new ArrayList<>();

    @OneToMany(mappedBy = "quizMasterInfo")
    private List<QuizResult> quizResultList = new ArrayList<>();

    @Column(length = 4)
    @Comment("시험년도")
    private int examYear;

    @Column(length = 10)
    @Comment("시험형식 코드")
    private String examGrpCd;

    @Comment("시험회차")
    private int examNo;

    @Column(length = 10)
    @Comment("시험과목 코드")
    private String subjectTypeCd;
}

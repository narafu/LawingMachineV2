package com.lawingmachinev2.app.entity;

import lombok.Data;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@Table(name = "QUIZ_USER_ANSWER")
public class QuizUserAnswer extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "quizUserAnswer_id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quizMasterInfo_id")
    private QuizMasterInfo quizMasterInfo;

    @OneToMany(mappedBy = "quizUserAnswer")
    private List<QuizUserAnswerOption> quizUserAnswerOptionList = new ArrayList<>();

    @Comment("사용자 아이디")
    private String userId;

    @Comment("사용자 답")
    private String userAnswer;

    @Column(length = 1)
    @Comment("정답 여부")
    private char answerYn = 'N';

    @Column(length = 1)
    @Comment("중요 문제 체크 여부")
    private char imprtChkYn = 'N';

    @Column(length = 1)
    @Comment("헷갈림 문제 체크 여부")
    private char cnfsdChkYn = 'N';

}

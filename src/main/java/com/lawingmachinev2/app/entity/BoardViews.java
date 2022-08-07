package com.lawingmachinev2.app.entity;


import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "BOARD_VIEWS")
public class BoardViews extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "boardViewc_id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BoardMasterInfo_id")
    private BoardMasterInfo boardMasterInfo;

}

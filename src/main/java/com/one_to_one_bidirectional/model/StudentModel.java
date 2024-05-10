package com.one_to_one_bidirectional.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stuRoll;
    private String stuName;
    private Long stuMarks;


    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "studentModel", fetch = FetchType.LAZY)
    private AddressModel addressModel;

}

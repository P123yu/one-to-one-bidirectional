package com.one_to_one_bidirectional.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    private String city;
    private String state;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "stu_roll", referencedColumnName = "stuRoll")
    private StudentModel studentModel;
}

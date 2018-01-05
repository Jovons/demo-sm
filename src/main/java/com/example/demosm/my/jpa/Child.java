package com.example.demosm.my.jpa;

import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Setter
public class Child extends Parent{


    String msg = "this is a child";

    // List<CustomState> customstates;
}

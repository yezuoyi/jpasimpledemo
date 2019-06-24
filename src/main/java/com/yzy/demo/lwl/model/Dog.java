package com.yzy.demo.lwl.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.yzy.demo.lwl.model.base.Pet;

@Entity
@Table(name = "t_dog")
public class Dog extends Pet{

    public Dog() {

    }
}
package com.example.techno_shop.model;
//
import lombok.NoArgsConstructor;

import javax.persistence.*;
//
@Entity
@Table(name="roles")
@NoArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
//
    @Column(name = "name", length = 40, nullable = false, unique = true)
    private String name;

    public Role(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//
//    public String toString(){
//        return this.name;
//    }
//
//
}

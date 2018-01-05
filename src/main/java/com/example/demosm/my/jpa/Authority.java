package com.example.demosm.my.jpa;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Set;


/**
 * Created by wensi on 2017-07-12.
 */
@Getter
@Setter
@Entity
@EntityListeners(AuthorityListener.class)
@JsonIdentityInfo(
    generator = ObjectIdGenerators.PropertyGenerator.class,
    property = "id")
public class Authority implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @JsonIgnore
    private String authority;

    private String description;

    @JsonIgnore
    private String treePath;

    /**
     * Every authority has only one parent. But one parent could have multiple authorities.
     */
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Authority parent;

    @OneToMany(mappedBy = "parent")
    private Set<Authority> children;

    private Short level;

    @ManyToOne(fetch = FetchType.LAZY)
    private Authority top;

    @JsonIgnore
    @OneToMany(mappedBy = "top")
    private Set<Authority> descendants;


}

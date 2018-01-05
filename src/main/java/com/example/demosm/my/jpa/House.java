package com.example.demosm.my.jpa;

import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import java.util.Set;

@Setter
@Entity
public class House extends AbstractPersistable<Long> {

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH}, fetch = FetchType.LAZY)
    Set<User> users;

    Long random;

    @PrePersist
    public void prePersist() {
        random = System.currentTimeMillis();
    }

}

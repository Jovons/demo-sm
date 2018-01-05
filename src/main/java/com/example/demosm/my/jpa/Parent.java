package com.example.demosm.my.jpa;

import lombok.AccessLevel;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Inheritance(strategy = InheritanceType.JOINED)
@Setter
public class Parent extends AbstractPersistable<Long> {
    LocalDateTime time;

    String detail;

    @ManyToMany(mappedBy = "parents")
    Set<User> users;

    @PrePersist
    public void prePersist() {
        time = LocalDateTime.now();
    }

}

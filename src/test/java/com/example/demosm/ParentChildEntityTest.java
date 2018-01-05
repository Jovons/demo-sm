package com.example.demosm;

import com.example.demosm.my.jpa.Child;
import com.example.demosm.my.jpa.ChildRepository;
import com.example.demosm.my.jpa.Parent;
import com.example.demosm.my.jpa.ParentRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class ParentChildEntityTest {

    @Autowired
    ChildRepository childRepository;

    @Autowired
    ParentRepository parentRepository;

    @Test
    public void t1() {
        Child child = new Child();
        child.setMsg("a msg");
        child.setDetail("detail msg");
        Set set = new HashSet<>();
        set.add(1L);
        set.add(2L);
        set.add(1L);
        childRepository.save(child);
    }

    @Test
    public void t2() {
        Child one = childRepository.findOne(2L);
        Parent p = parentRepository.findOne(2L);
        log.info(one.toString());
    }
}

package com.example.demosm;

import com.example.demosm.my.jpa.House;
import com.example.demosm.my.jpa.HouseRepository;
import com.example.demosm.my.jpa.ParentRepository;
import com.example.demosm.my.jpa.User;
import com.example.demosm.my.jpa.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JoinTableTest {

    @Autowired
    private ParentRepository repository;

    @Autowired
    private HouseRepository houseRepository;

    @Autowired
    private UserRepository userRepository;

    @Transactional
	@Test
	public void contextLoads() throws IOException {
        House house =new House();
        User u = userRepository.findOne(1L);

        Set us = new HashSet<>();
        us.add(u);

        house.setUsers(us);
        house = houseRepository.saveAndFlush(house);

        //Set aa = new HashSet<>();
        //aa.add(house);
        //u.setHouses(aa);
        // userRepository.save(u);
	}

}

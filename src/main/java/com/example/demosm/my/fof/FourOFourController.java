package com.example.demosm.my.fof;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@RequestMapping("fof")
@Controller
public class FourOFourController {

    @RequestMapping("index")
    private String index() {
        return "index";
    }


    @ResponseBody
    @RequestMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity getworkList() {
        log.info("");

        return ResponseEntity.ok(new Address("GETstreet").toJson());
    }

    @ResponseBody
    @RequestMapping(value = "getok")
    private ResponseEntity<String> getok() {
        log.info("");
        return ResponseEntity.ok(new Address("GETstreet").toJson());
    }

    @Getter
    @AllArgsConstructor
    public class Address{
        String city;

        public String toJson() {
            ObjectMapper mapper = new ObjectMapper();
            try {
                return mapper.writeValueAsString(this);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    @ResponseBody
    @RequestMapping(value = "post", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity post() {
        log.info("");
        return ResponseEntity.ok(new Address("GETstreet").toJson());
    }
}

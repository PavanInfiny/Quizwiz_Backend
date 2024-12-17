package com.socialmedia.backend.controller;

import com.socialmedia.backend.model.quizdetail;
import com.socialmedia.backend.model.quizmcqs;
import com.socialmedia.backend.service.quizcreateservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class postscontroller {
    @Autowired
    quizcreateservice ps;
    @PostMapping("/addquizdetail")
    public void addquiz(@RequestBody quizdetail p){
        System.out.println(p);
        ps.savequizdetails(p);
    }
    @PostMapping("/addquizmcqs")
    public void addquizmcqs(@RequestBody quizmcqs q){
        System.out.println(q);
        ps.savequizmcqs(q);
    }
    @GetMapping("/takequiz/{quizid}")
    public ArrayList<quizmcqs> getquiz(@PathVariable int quizid){
        return ps.getallmcqs(quizid);
    }
}

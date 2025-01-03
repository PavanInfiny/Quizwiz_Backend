package com.socialmedia.backend.controller;

import com.socialmedia.backend.model.quizdetail;
import com.socialmedia.backend.model.quizmcqs;
import com.socialmedia.backend.model.quizparticipated;
import com.socialmedia.backend.service.quizcreateservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@Controller
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
    public List<quizmcqs> getquiz(@PathVariable int quizid){
        return ps.getQuestionsByQuizId(quizid);
    }
    @PostMapping("/addparticipated")
    public void addparticipatedquizdetail(@RequestBody quizparticipated q){
        System.out.println(q);
        ps.saveparticipated(q);
    }
    @GetMapping("/getpartipateddetails/{prefix}")
    public List<quizparticipated> getparticipant(@PathVariable String prefix){
        return ps.getparticipentdetail(prefix);
    }
    @GetMapping("/getcreateddetails/{userid}")
    public List<quizdetail> getparticipant(@PathVariable int userid){
        return ps.getcreaterdetail(userid);
    }
}

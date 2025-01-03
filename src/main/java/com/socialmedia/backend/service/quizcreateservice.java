package com.socialmedia.backend.service;

import com.socialmedia.backend.model.quizdetail;
import com.socialmedia.backend.model.quizmcqs;
import com.socialmedia.backend.model.quizparticipated;
import com.socialmedia.backend.repo.quizdetailsrepo;
import com.socialmedia.backend.repo.quizmcqsrepo;
import com.socialmedia.backend.repo.quizparticipatedrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class quizcreateservice {
    @Autowired
    quizdetailsrepo pr;
    @Autowired
    quizmcqsrepo mr;
    @Autowired
    quizparticipatedrepo qpr;
    public void savequizdetails(quizdetail q){
        pr.save(q);
    }
    public void savequizmcqs(quizmcqs q){
        mr.save(q);
    }
    public List<quizmcqs> getQuestionsByQuizId(int quizid) {
        return mr.findByquizid(quizid);
    }

    public void saveparticipated(quizparticipated q) {
        qpr.save(q);
    }

    public List<quizparticipated> getparticipentdetail(String prefix) {
       return qpr.findByidStartingWith(prefix);
    }

    public List<quizdetail> getcreaterdetail(int userid) {
        return pr.findByuserid(userid);
    }
}




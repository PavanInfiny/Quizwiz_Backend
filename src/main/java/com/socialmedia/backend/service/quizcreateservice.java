package com.socialmedia.backend.service;

import com.socialmedia.backend.model.quizdetail;
import com.socialmedia.backend.model.quizmcqs;
import com.socialmedia.backend.repo.quizdetailsrepo;
import com.socialmedia.backend.repo.quizmcqsrepo;
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
    public void savequizdetails(quizdetail q){
        pr.save(q);
    }
    public void savequizmcqs(quizmcqs q){
        mr.save(q);
    }

    public ArrayList<quizmcqs> getallmcqs(int quizid) {
        List<quizmcqs> mcqsList = mr.FindByquizid(quizid);
        return new ArrayList<>(mcqsList);
    }
}




package com.socialmedia.backend.repo;
import com.socialmedia.backend.model.quizdetail;
import com.socialmedia.backend.model.quizmcqs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface quizmcqsrepo extends JpaRepository<quizmcqs,Integer>{
    public List<quizmcqs> FindByquizid(int quizid);
}

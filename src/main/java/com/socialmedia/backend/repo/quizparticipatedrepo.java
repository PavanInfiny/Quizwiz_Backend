package com.socialmedia.backend.repo;
import com.socialmedia.backend.model.quizdetail;
import com.socialmedia.backend.model.quizmcqs;
import com.socialmedia.backend.model.quizparticipated;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface quizparticipatedrepo extends JpaRepository<quizparticipated,String> {
    List<quizparticipated> findByidStartingWith(String prefix);
}

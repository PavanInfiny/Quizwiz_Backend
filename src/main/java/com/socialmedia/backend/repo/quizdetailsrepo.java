package com.socialmedia.backend.repo;

import com.socialmedia.backend.model.quizdetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface quizdetailsrepo extends JpaRepository<quizdetail,Integer> {
}

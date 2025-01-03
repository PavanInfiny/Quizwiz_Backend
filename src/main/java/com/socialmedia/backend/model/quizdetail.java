package com.socialmedia.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
@Entity
@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class quizdetail {
    @Id
    private int quizid;
    private String quiztitle;
    private String numofque;
    private int userid;
}



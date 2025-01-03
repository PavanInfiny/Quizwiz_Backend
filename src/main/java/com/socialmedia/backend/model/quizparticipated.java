package com.socialmedia.backend.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class quizparticipated {
    @Id
    String id;
    private int userid;
    private int maxscore;
    private int score;
    private int quizid;

}

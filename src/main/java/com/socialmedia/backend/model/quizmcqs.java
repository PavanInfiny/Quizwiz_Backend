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
public class quizmcqs {
    @Id
    int queid;
    @Column(length = 1000)
    String answer;
    @Column(length = 1000)
    String option1;
    @Column(length = 1000)
    String option2;
    @Column(length = 1000)
    String option3;
    @Column(length = 1000)
    String option4;
    @Column(length = 1000)
    String question;
    int quizid;
}

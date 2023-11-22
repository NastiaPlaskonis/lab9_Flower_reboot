package ucu.edu.ua.demo.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Transient;
import jakarta.persistence.GeneratedValue;

import java.time.LocalDate;
import java.time.Period;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "users")

public class User {
    @GeneratedValue
    @Id
    private int userId;

    @Column(name="email", unique = true)
    private String userEmail;

    @Transient
    private int userAge;
    private LocalDate userDob;
    public int getAge(){
        return Period.between(userDob, LocalDate.now()).getYears();
    }
}
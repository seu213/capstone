package com.example.demo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class USER {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserID;

    @Column(nullable = false)
    private String PhoneNumber;

    @Column(nullable = false)
    private String NickName;

    private String UserImage;
    private Integer UserSell;
    private Integer UserBuy;

    @Column(nullable = false)
    private LocalDateTime Created;

    private LocalDateTime Updated;
    private Integer Statuss;

    // Getters and setters
}

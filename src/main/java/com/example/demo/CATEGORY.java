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
public class CATEGORY {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CategoryID;

    @Column(nullable = false)
    private String CategoryName;

    @Column(nullable = false)
    private String CategoryImage;

    @Column(nullable = false)
    private LocalDateTime Created;

    private LocalDateTime Updated;
    private Integer Statuss;

    // Getters and setters
}

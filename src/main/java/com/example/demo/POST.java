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
public class POST {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PostID;

    @ManyToOne
    @JoinColumn(name = "UserID", nullable = false)
    private USER user;

    private Integer TownID;

    @Column(nullable = false)
    private String PostTitle;

    @ManyToOne
    @JoinColumn(name = "CategoryID", nullable = false)
    private CATEGORY category;

    private Integer PostCost;
    private String PostContent;
    private String PostImage;

    @Column(nullable = false)
    private LocalDateTime Created;

    private LocalDateTime Updated;
    private Integer Statuss;
}


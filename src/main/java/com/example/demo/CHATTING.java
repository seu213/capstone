package com.example.demo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(ChattingId.class)
public class CHATTING implements Serializable {
    @Id
    private Long PostID;

    @Id
    private Long UserID;

    @Column(nullable = false)
    private String BuySell;

    @Column(nullable = false)
    private LocalDateTime Created;

    private LocalDateTime Updated;
    private Integer Status;

    // Getters and setters

}

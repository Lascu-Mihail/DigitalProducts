package com.digitalstore.EssenceVerse.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "oauth2_token")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OAuth2Token {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String accessToken;

    @Column(nullable = false)
    private String refreshToken;

    private LocalDateTime  expiration;
}

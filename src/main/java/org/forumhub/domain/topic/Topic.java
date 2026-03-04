package org.forumhub.domain.topic;

import jakarta.persistence.*;
import lombok.*;
import org.forumhub.domain.user.User;

import java.time.LocalDateTime;

@Entity
@Table(name = "topic")
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private LocalDateTime date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

}

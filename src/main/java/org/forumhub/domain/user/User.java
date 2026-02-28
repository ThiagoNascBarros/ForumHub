package org.forumhub.domain.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "user")
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor @NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    private String fullname;

    @NotBlank
    private String simplename;

    @NotBlank
    private String email;

    @NotBlank
    private String password;

}

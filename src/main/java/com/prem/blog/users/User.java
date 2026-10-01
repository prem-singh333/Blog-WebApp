package com.prem.blog.users;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@NoArgsConstructor
@Table("users")
public class User {

    @Id
    private Long id;
    private String name;
    private String username;
    private String email;
    private String password;
}

package com.free_project.book.springboot.config.auth.dto;

import com.free_project.book.springboot.domain.posts.user.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
public class SessionUser {
    private final String name;
    private final String email;
    private final String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}

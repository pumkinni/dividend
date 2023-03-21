package com.example.dividend.model;

import lombok.Data;

import java.util.List;

public class Auth {

    // 로그인 클래스
    @Data
    public static class SignIn {
        private String username;
        private String password;

    }

    // 회원가입 클래스
    @Data
    public static class SignUp {
        private String username;
        private String password;
        private List<String> roles;

        public MemberEntity toEntity() {
            return MemberEntity.builder()
                    .username(this.username)
                    .password(this.password)
                    .roles(this.roles)
                    .build();
        }

    }

}

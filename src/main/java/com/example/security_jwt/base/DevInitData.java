package com.example.security_jwt.base;

import com.example.security_jwt.member.entity.Member;
import com.example.security_jwt.member.service.MemberService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@Profile("dev")
public class DevInitData {

    @Bean
    CommandLineRunner initData(MemberService memberService, PasswordEncoder passwordEncoder) {

        String password = passwordEncoder.encode("1234");

        return args -> {
            Member member1 = memberService.join("user1", password, "user1@test.com");
            Member member2 = memberService.join("user2", password, "user2@test.com");
        };

    }

}

package com.ksieon.springstudy;

import com.ksieon.springstudy.repository.MemberRepository;
import com.ksieon.springstudy.repository.MemoryMemberRepository;
import com.ksieon.springstudy.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }
}

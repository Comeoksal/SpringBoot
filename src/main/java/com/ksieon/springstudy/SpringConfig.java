package com.ksieon.springstudy;

import com.ksieon.springstudy.domain.Member;
import com.ksieon.springstudy.repository.JpaMemberRepository;
import com.ksieon.springstudy.repository.MemberRepository;
import com.ksieon.springstudy.repository.MemoryMemberRepository;
import com.ksieon.springstudy.service.MemberService;
import jakarta.persistence.EntityManager;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    //private final EntityManager em;

    private final MemberRepository memberRepository;
    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
//    @Bean
//    public MemberRepository memberRepository() {
//
//        //return new MemoryMemberRepository();
//        //return new JpaMemberRepository(em);
//
//    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }
}

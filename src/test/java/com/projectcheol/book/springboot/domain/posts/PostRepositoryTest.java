package com.projectcheol.book.springboot.domain.posts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;

//@WebMvcTest(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PostRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    // @AfterEach : Junit에서 단위 테스트가 끝날 때마다 수행
    @AfterEach
    public void cleanup(){
        postsRepository.deleteAll();
    }

    @Test
    void 게시글저장_불러오기(){
        //given
        String title = "테스트 게시글";
        String content = "테스트 본문";

        // .save = CRUD 중 Create 혹은 Update
        postsRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author("jojoldu@gmail.com")
                .build()
        );

        //when
        // .findAll() = CRUD 중 Request
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }
}
// postsRepository.save
// : 테이블 posts에 insert 혹은 update 쿼리 실행
// : id값이 있다면 update, 없다면 insert 실행

// postsRepository.findAll()
// : 테이블 posts에 있는 모든 데이터를 조회하는 메소드
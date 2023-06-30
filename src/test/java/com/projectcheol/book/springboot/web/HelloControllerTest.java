package com.projectcheol.book.springboot.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.is;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@Slf4j
@WebMvcTest(HelloController.class)
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void hello가_리턴된다() throws Exception{
        // given
        String hello = "hello";

        // when
        mvc.perform(get("/hello"))
                // then
                .andExpect(status().isOk())
                .andExpect(content().string(hello));

        log.info("리턴");
    }

    @Test
    void helloDto가_리턴된다() throws Exception{
        String name = "hello";
        int amount = 1000;

        mvc.perform(
                get("/hello/dto")
                        .param("name", name)
                        .param("amount", String.valueOf(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.amount", is(amount))
        );
    }
}
// .param 이란
// : API 테스트시 사용될 요청 파라미터 설정(단, String만 허용)

// jsonPath 란
// : JSON 응답 값을 필드별로 검증하는 메소드
// : $를 기준으로 필드명 명시
// : 여기서는 name, amount 검증을 위해 -> $.name, $.amount로 검증
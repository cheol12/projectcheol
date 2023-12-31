package com.projectcheol.book.springboot.web.dto;

import com.projectcheol.book.springboot.web.Dto.HelloResponsDto;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트(){
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponsDto dto = new HelloResponsDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
// assertThat란?
// : assertj 라는 테스트 검증 라이브러리의 검증 메소드
// : 검증하고 싶은 대상을 메소드 인자로 받는다.

// isEqualTo란
// : assertj의 동등 비교 메소드
// : assertThat에 있는 값과 isEqualTo의 값을 비교해서 같을 때만 성공!
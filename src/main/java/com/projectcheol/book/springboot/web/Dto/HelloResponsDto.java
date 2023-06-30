package com.projectcheol.book.springboot.web.Dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


// 클래스 내 모든 필드의 getter 메소드 생성
@Getter
// 선언된 모든 final 필드가 포함된 생성자를 생성
// final이 없는 필드는 생성자에 포함 X
@RequiredArgsConstructor
public class HelloResponsDto {

    private final String name;
    private final int amount;
}

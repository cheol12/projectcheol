package com.projectcheol.book.springboot.domain.posts;

import com.projectcheol.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Posts extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
// Posts 클래스는 실제 DB 테이블과 매칭될 클래스(Entity 클래스 = 어노테이션으로 설정)
// 어노테이션 순서도 중요 : 주요 어노테이션을 클래스에 가깝게 둔다.

// 주요 어노테이션은 @Entity를 가깝게 두고,
// 롬복 어노테이션 @Getter, @NoArgsConstructor 를 그 위에 둠.

// JPA 제공 어노테이션
// : @Entity - 테이블과 링크될 클래스 설정

// : @Id - 해당 테이블의 PK 필드

// : @GeneratedValue - PK 생성 규칙

// : @Column - 굳이 선언하지 않아도 해당 클래스의 필드는 모두 컬럼이 되지만
//           - 기본값 이외에 추가로 옵션 변경이 필요할 경우 사용
//           - 기본값이 VARCHAR(255)에서 사이즈를 500으로 늘리거나
//           - 타입을 TEXT로 변경하고 싶은 경우 등등

// : @NoArgsConstructor - 기본 생성자 자동 추가
//                      - Public Posts(){} 와 같은 효과

// : @Getter - 클래스 내 모든 필드의 Getter 메소드 자동 생성

// : @Builder - 해당 클래스의 빌더 패턴 클래스 생성
//            - 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함

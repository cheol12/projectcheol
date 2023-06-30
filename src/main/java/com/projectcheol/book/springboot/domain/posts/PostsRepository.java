package com.projectcheol.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// MyBatis에서 dao라고 불리는 DB Layer 접근자
// JPA에선 REpository라고 부르며 인터페이스로 생성
// 단순히 인터페이스를 생성 후, JpaRepository<Entity 클래스, PK 타입>을
// 상속하면 기본적인 CRUD 메서드가 자동 생성됨.
//⚠️주의 : Entity 클래스와 기본 Entity Repository는 함께 위치해야 함
//-> Entity 클래스는 기본 Repository 없이는 제대로 역할을 할 수 ❌
//나중에 프로젝트 규모가 커져 도메인별로 프로젝트를 분리해야 한다면,
//Entity 클래스와 기본 Repository는 함께 움직여야 하므로 도메인 패키지에서 함께 관리

public interface PostsRepository extends JpaRepository<Posts, Long> {

}

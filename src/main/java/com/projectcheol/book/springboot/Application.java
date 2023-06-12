package com.projectcheol.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args){
        // 내장 WAS(웹 어플리케이션 서버) 실행
        SpringApplication.run(Application.class, args);

        //내장 WAS란?
        //별도로 외부에 WAS를 두지 않고, 애플리케이션을 실행할 때 내부에서 WAS를 실행하는 것을 의미.
        //항상 서버에 톰캣을 설치할 필요 X. → 스프링 부트로 만들어진 Jar 파일로 실행하면 된다.
        //내장 WAS를 사용하는 이유 : 언제 어디서나 같은 환경에서 스프링 부트를 배포할 수 있기 때문
    }
}

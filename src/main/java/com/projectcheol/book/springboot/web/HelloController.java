package com.projectcheol.book.springboot.web;


import com.projectcheol.book.springboot.web.Dto.HelloResponsDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello() {

        log.info("hello출력");
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponsDto helloDto (@RequestParam("name") String name,
                                     @RequestParam("amount") int amount){

        return new HelloResponsDto(name, amount);
    }

}
// @RequestParam 란
// : 외부에서 API로 넘긴 파라미터를 가져오는 어노테이션
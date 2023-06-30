package com.projectcheol.book.springboot.web;

import com.projectcheol.book.springboot.service.posts.PostsService;
import com.projectcheol.book.springboot.web.Dto.PostsSavaRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor//lombok설정
@RestController
public class PostApiController {
    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public long save(@RequestBody PostsSavaRequestDto requestDto){
        return postsService.save(requestDto);
    }
}

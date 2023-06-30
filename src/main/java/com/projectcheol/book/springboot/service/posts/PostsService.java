package com.projectcheol.book.springboot.service.posts;

import com.projectcheol.book.springboot.domain.posts.Posts;
import com.projectcheol.book.springboot.domain.posts.PostsRepository;
import com.projectcheol.book.springboot.web.Dto.*;
import com.projectcheol.book.springboot.web.Dto.PostsSavaRequestDto;
//import com.projectcheol.book.springboot.web.Dto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSavaRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}

package com.production.ready_features.demo.service;

import com.production.ready_features.demo.dto.PostDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService {
    List<PostDto> getAllPosts();
    PostDto createNewPost(PostDto postDto);

    PostDto getPostById(long id);
}

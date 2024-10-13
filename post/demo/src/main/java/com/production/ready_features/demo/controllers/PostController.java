package com.production.ready_features.demo.controllers;

import com.production.ready_features.demo.dto.PostDto;
import com.production.ready_features.demo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping
    List<PostDto> getAllPost(){
        return postService.getAllPosts();
    }

    @PostMapping("/create")
    PostDto createPost(@RequestBody PostDto postDto){
        return postService.createNewPost(postDto);
    }

    @GetMapping(path = "/{id}")
        PostDto getPostById(@PathVariable long id){
            return postService.getPostById(id);
        }

}

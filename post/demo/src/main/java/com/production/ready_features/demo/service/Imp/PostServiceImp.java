package com.production.ready_features.demo.service.Imp;

import com.production.ready_features.demo.dto.PostDto;
import com.production.ready_features.demo.entities.PostEntity;
import com.production.ready_features.demo.exception.ResourceNotFoundException;
import com.production.ready_features.demo.repo.PostRepo;
import com.production.ready_features.demo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostServiceImp implements PostService {

    private final PostRepo postRepo;
    private final ModelMapper modelMapper;


    @Override
    public List<PostDto> getAllPosts() {
        return postRepo
                .findAll()
                .stream()
                .map(postEntity -> modelMapper.map(postEntity,PostDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public PostDto createNewPost(PostDto postDto) {
        PostEntity postEntity = modelMapper.map(postDto,PostEntity.class);
        return modelMapper.map(postRepo.save(postEntity),PostDto.class);
    }

    @Override
    public PostDto getPostById(long id) {
        PostEntity postEntity = postRepo
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Post not available with the id"));

        return modelMapper.map(postEntity,PostDto.class);
    }
}

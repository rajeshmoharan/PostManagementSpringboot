package com.production.ready_features.demo.repo;

import com.production.ready_features.demo.entities.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends JpaRepository<PostEntity,Long> {
}

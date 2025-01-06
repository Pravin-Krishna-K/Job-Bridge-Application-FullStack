package com.pravin.joblisting.repository;

import com.pravin.joblisting.model.Post;
import org.springframework.stereotype.Component;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
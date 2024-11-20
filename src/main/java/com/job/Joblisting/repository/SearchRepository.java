package com.job.Joblisting.repository;

import com.job.Joblisting.model.Post;

import java.util.*;
public interface SearchRepository {
    List<Post> findByText(String text);
}

package br.com.wferreiracosta.dan.service;

import br.com.wferreiracosta.dan.model.Post;

import java.util.List;

public interface PostService {

    List<Post> findAll();

    Post findById(Long id);

    Post save(Post post);

}

package br.com.wferreiracosta.dan.service.impl;

import br.com.wferreiracosta.dan.exception.ObjectNotFoundException;
import br.com.wferreiracosta.dan.model.Post;
import br.com.wferreiracosta.dan.repository.PostRepository;
import br.com.wferreiracosta.dan.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.String.format;

@Slf4j
@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Post findById(final Long id) {
        return postRepository.findById(id)
                .orElseThrow(() -> {
                    final var message = format("Postagem com ID %s não econtrada", id);
                    log.error(message);
                    throw new ObjectNotFoundException(message);
                });
    }

    @Override
    public Post save(final Post post) {
        return postRepository.save(post);
    }

}

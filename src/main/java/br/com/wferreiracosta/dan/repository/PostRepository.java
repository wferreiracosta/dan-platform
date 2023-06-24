package br.com.wferreiracosta.dan.repository;

import br.com.wferreiracosta.dan.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}

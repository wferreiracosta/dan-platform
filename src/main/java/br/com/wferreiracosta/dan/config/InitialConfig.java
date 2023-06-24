package br.com.wferreiracosta.dan.config;

import br.com.wferreiracosta.dan.model.Post;
import br.com.wferreiracosta.dan.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
@RequiredArgsConstructor
public class InitialConfig {

    private final PostRepository postRepository;

    @Bean
    public void insert() {
        final var post1 = Post.builder()
                .titulo("Lorem")
                .autor("Wesley")
                .data(LocalDate.now())
                .conteudo("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras at maximus tortor." +
                        " Praesent congue orci quis sagittis venenatis. Aenean laoreet id eros eu pellentesque." +
                        " Vestibulum vel nunc luctus, semper ex rhoncus, lacinia magna." +
                        " Pellentesque porta vehicula molestie. Etiam sit amet interdum sem, nec luctus nisl." +
                        " Pellentesque at enim a mi elementum cursus. Praesent vel iaculis diam." +
                        " Praesent tristique fringilla fringilla. Mauris aliquet velit justo." +
                        " Etiam non leo semper, varius libero at, vulputate dolor." +
                        " Mauris hendrerit dapibus massa, eu malesuada nulla rutrum congue. Fusce consequat eleifend vestibulum. Vestibulum in arcu libero. ")
                .build();

        final var post2 = Post.builder()
                .titulo("Lorem ipsum")
                .autor("Wesley")
                .data(LocalDate.now())
                .conteudo("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras at maximus tortor." +
                        " Praesent congue orci quis sagittis venenatis. Aenean laoreet id eros eu pellentesque." +
                        " Vestibulum vel nunc luctus, semper ex rhoncus, lacinia magna." +
                        " Pellentesque porta vehicula molestie. Etiam sit amet interdum sem, nec luctus nisl." +
                        " Pellentesque at enim a mi elementum cursus. Praesent vel iaculis diam." +
                        " Praesent tristique fringilla fringilla. Mauris aliquet velit justo." +
                        " Etiam non leo semper, varius libero at, vulputate dolor." +
                        " Mauris hendrerit dapibus massa, eu malesuada nulla rutrum congue. Fusce consequat eleifend vestibulum. Vestibulum in arcu libero. ")
                .build();

        final var post3 = Post.builder()
                .titulo("Lorem ipsum dolor")
                .autor("Wesley")
                .data(LocalDate.now())
                .conteudo("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras at maximus tortor." +
                        " Praesent congue orci quis sagittis venenatis. Aenean laoreet id eros eu pellentesque." +
                        " Vestibulum vel nunc luctus, semper ex rhoncus, lacinia magna." +
                        " Pellentesque porta vehicula molestie. Etiam sit amet interdum sem, nec luctus nisl." +
                        " Pellentesque at enim a mi elementum cursus. Praesent vel iaculis diam." +
                        " Praesent tristique fringilla fringilla. Mauris aliquet velit justo." +
                        " Etiam non leo semper, varius libero at, vulputate dolor." +
                        " Mauris hendrerit dapibus massa, eu malesuada nulla rutrum congue. Fusce consequat eleifend vestibulum. Vestibulum in arcu libero. ")
                .build();

        postRepository.saveAll(List.of(post1, post2, post3));
    }

}

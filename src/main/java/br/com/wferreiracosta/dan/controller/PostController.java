package br.com.wferreiracosta.dan.controller;

import br.com.wferreiracosta.dan.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/posts")
    public ModelAndView findAll() {
        final var mv = new ModelAndView("posts");
        final var posts = postService.findAll();
        mv.addObject("posts", posts);
        return mv;
    }

}

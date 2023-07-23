package br.com.wferreiracosta.dan.controller;

import br.com.wferreiracosta.dan.model.Post;
import br.com.wferreiracosta.dan.service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;

@Controller
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/posts")
    public ModelAndView pagePosts() {
        final var mv = new ModelAndView("posts");
        final var posts = postService.findAll();
        mv.addObject("posts", posts);
        return mv;
    }

    @GetMapping("/posts/{id}")
    public ModelAndView pagePostDetails(@PathVariable("id") long id) {
        final var mv = new ModelAndView("postDetails");
        final var post = postService.findById(id);
        mv.addObject("post", post);
        return mv;
    }

    @GetMapping("/posts/new")
    public String pageNewPost(){
        return "postForm";
    }

    @PostMapping("/posts/new")
    public String save(@Valid Post post, BindingResult result, RedirectAttributes attributes){
        if(result.hasErrors()){
            return "redirect:/posts/new";
        }

        post.setData(LocalDate.now());
        postService.save(post);

        return "redirect:/posts";
    }

}

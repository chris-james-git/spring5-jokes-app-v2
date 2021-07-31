package guru.springframework.spring5jokesappv2.controllers;

import guru.springframework.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokesService;

    public JokeController(JokeService jokeService) {
        this.jokesService = jokeService;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {

        model.addAttribute("joke", jokesService.getJoke());

        return "index";
    }
}

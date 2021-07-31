package guru.springframework.norris.chuck.jokes.controllers;

import guru.springframework.norris.chuck.jokes.services.JokeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokeServiceImpl jokesService;

    public JokesController(JokeServiceImpl jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {

        model.addAttribute("joke", jokesService.getJoke());

        return "jokes/index";
    }
}

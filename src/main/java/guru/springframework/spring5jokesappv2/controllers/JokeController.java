package guru.springframework.spring5jokesappv2.controllers;

import guru.springframework.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jt on 1/23/21.
 */
@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""} )
    public String showJoke(Model model) {

        model.addAttribute("joke", jokeService.getJoke());

        // returns to html start page named index

        return "index";

    }

   // public String handlePost(@RequestParam String action, Model model) {
    @RequestMapping(value = "test", method= RequestMethod.GET)
    public String handlePost(Model model) {

     // does bot work  String ans =  jokeService.getJoke();

       String ans = showJoke(model);

    //    System.out.println("Joke" + ans);
       // returning model to index

       return ans;

    }

}

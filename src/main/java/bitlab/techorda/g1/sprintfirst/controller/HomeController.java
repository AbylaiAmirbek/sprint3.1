package bitlab.techorda.g1.sprintfirst.controller;

import bitlab.techorda.g1.sprintfirst.db.DbManager;
import bitlab.techorda.g1.sprintfirst.model.Developer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/") // WebServlet("/")
    public String homePage(Model model) {
        List<Developer> developers = DbManager.getDevelopers();
        model.addAttribute("razraby", developers);
        return "home";
    }

    @GetMapping("/list")
    public String listPage(Model model) {
        return "list";
    }

    @PostMapping("/developers/add")
    public String addDeveloper(Developer developer) {
        DbManager.createDeveloper(developer);
        return "redirect:/";
    }
}

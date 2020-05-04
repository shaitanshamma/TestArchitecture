package lesson6.controller;

import lesson6.service.FilmService;
import lesson6.service.GlueService;
import lesson6.service.LaminationFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private GlueService glueService;
    @Autowired
    private FilmService filmService;
    @Autowired
    private LaminationFilmService laminationFilmService;

    @GetMapping("/")
    public String indexPage(Model model) {
        return "index";
    }

    @GetMapping("/1")
    public String onePage(Model model) {
        return "1";
    }

    @GetMapping("/glue")
    public String gluePage(Model model) {
        model.addAttribute("glue",glueService.findAll());
        return "glue";
    }

    @GetMapping("/film")
    public String filmPage(Model model) {
        model.addAttribute("film",filmService.findAll());
        return "film";
    }
    @GetMapping("/lamination")
    public String laminationPage(Model model) {
        model.addAttribute("lamination",laminationFilmService.findAll());
        return "lamination";
    }
}

package lat.ahsokavoice.api.controllers;

import lat.ahsokavoice.api.models.AchievementModel;
import lat.ahsokavoice.api.services.AchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
//asigna una url llave para todo lo referente a achievements
@RequestMapping("/achievements")
public class AchievementServiceController {


    @Autowired
    AchievementService achievementService;

    @GetMapping("/")
    public Collection<AchievementModel> index() {
        return achievementService.getachievement();
    }

    //Solicita un valor `title` y devuelve `Hello title`
    @GetMapping("{title}")
    public String getHello(@PathVariable("title") String title) {
        return achievementService.getHello(title);
    }

}

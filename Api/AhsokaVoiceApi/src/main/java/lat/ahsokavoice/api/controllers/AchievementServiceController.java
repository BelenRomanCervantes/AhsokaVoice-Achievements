package lat.ahsokavoice.api.controllers;

import lat.ahsokavoice.api.models.AchievementModel;
import lat.ahsokavoice.api.services.AchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
//Asigna una url llave
@RequestMapping("/achievements")
public class AchievementServiceController {


    @Autowired
    AchievementService achievementService;


    //Create achievement
    @PostMapping("/")
    public AchievementModel createAchievementController(@RequestBody AchievementModel achievement) {
        return achievementService.createAchievement(achievement);
    }

    //Get all achievements
    @GetMapping("/")
    public List<AchievementModel> getAllAchievementsController() {
        return achievementService.getAllAchievements();
    }

    //Update an achievement by id
    @PatchMapping("/{id}")
    public Optional<AchievementModel> updateAchiemeventById(@PathVariable Long id, @RequestBody AchievementModel request){
        return achievementService.updateAchiemeventById(id, request);
    }

        //Get achievement by id
/*    @GetMapping("/")
    public AchievementModel index() {
        return (AchievementModel) achievementService.getAchievementById();
    }*/


    }
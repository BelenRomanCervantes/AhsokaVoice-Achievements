package lat.ahsokavoice.api.controllers;

import lat.ahsokavoice.api.models.AchievementModel;
import lat.ahsokavoice.api.services.AchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/achievements")
public class AchievementServiceController {


    @Autowired
    AchievementService achievementService;


    //Create achievement
    @PostMapping("/create")
    public AchievementModel createAchievementController(@RequestBody AchievementModel achievement) {
        return achievementService.createAchievement(achievement);
    }

    //Save an URL image to an achievement
    @PostMapping("/create/image/{id}")
    public Optional<AchievementModel> saveAchievementImageController(@PathVariable Long id, @RequestBody AchievementModel request) {
        return achievementService.saveAchievementImage(id, request);
    }

    //Get all achievements
    @GetMapping("/getall")
    public List<AchievementModel> getAllAchievementsController() {
        return achievementService.getAllAchievements();
    }

    //Update an achievement by id
    @PatchMapping("/update/{id}")
    public Optional<AchievementModel> updateAchiemeventById(@PathVariable Long id, @RequestBody AchievementModel request){
        return achievementService.updateAchiemeventById(id, request);
    }

    //Delete an achievement by id
    @DeleteMapping("/delete/{id}")
    public String deleteAchievementController(@PathVariable Long id) {
        if (achievementService.deleteAchievementById(id)) {
            return "Achievement deleted successfully";
        } else {
            return "Error";
        }
    }

    }
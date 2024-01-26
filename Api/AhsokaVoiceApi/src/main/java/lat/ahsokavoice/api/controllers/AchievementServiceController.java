package lat.ahsokavoice.api.controllers;

import lat.ahsokavoice.api.models.AchievementModel;
import lat.ahsokavoice.api.request.AchievementRequest;
import lat.ahsokavoice.api.response.AchievementResponse;
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
    public AchievementModel createController(@RequestBody AchievementModel newAchievement) {
        return achievementService.create(newAchievement);
    }

    //Get all achievements
    @GetMapping("/getall")
    public List<AchievementModel> getAllController() {
        return achievementService.getAll();
    }

    //Get an achievement by id
    @GetMapping("/getbyid/{id}")
    public AchievementModel getByIdController(@PathVariable Long id) {
        return achievementService.getById(id);
    }

    //Update an achievement by id
    @PatchMapping("/patch/{id}")
    public AchievementModel patchController(@PathVariable Long id, @RequestBody AchievementModel newData){
        return achievementService.patchById(id, newData);
    }

    @PutMapping("/put/{id}")
    public AchievementModel putController(@PathVariable Long id, @RequestBody AchievementModel newData){
        return achievementService.putById(id, newData);
    }

    //Delete an achievement by id
    @DeleteMapping("/delete/{id}")
    public String deleteAchievementController(@PathVariable Long id) {
        if (achievementService.deleteById(id)) {
            return "Achievement deleted successfully";
        } else {
            return "Error";
        }
    }

    }
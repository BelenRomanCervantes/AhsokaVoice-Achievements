package lat.ahsokavoice.api.services;

import lat.ahsokavoice.api.models.AchievementModel;

import java.util.List;
import java.util.Optional;


public interface AchievementService {

    //Create achievement
    AchievementModel createAchievement(AchievementModel achievement);

    //Get all achievements
    List<AchievementModel> getAllAchievements();

    //Update an achievement by id
    Optional<AchievementModel> updateAchiemeventById(Long id, AchievementModel request);

    //Update an achievement by id
    Optional<AchievementModel> updateAchievementById(Long id, AchievementModel achievementReceived);

    void updateAchievement(Long id, AchievementModel achievement);


}

package lat.ahsokavoice.api.services;

import lat.ahsokavoice.api.models.AchievementModel;

import java.util.List;
import java.util.Optional;


public interface AchievementService {

    //Create achievement
    public AchievementModel createAchievement(AchievementModel achievement);

    public Optional<AchievementModel> saveAchievementImage(Long id, AchievementModel achievement);

    //Get all achievements
    public List<AchievementModel> getAllAchievements();

    //Update an achievement by id
    public Optional<AchievementModel> updateAchiemeventById(Long id, AchievementModel achievement);

    //Update an achievement by id
    public Optional<AchievementModel> updateAchievementById(Long id, AchievementModel achievementReceived);

    //Delete an achievement by id
    public Boolean deleteAchievementById(Long id);




}

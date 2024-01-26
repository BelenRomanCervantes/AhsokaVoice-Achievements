package lat.ahsokavoice.api.services;

import lat.ahsokavoice.api.models.AchievementModel;
import lat.ahsokavoice.api.request.AchievementRequest;
import lat.ahsokavoice.api.response.AchievementResponse;

import java.util.List;


public interface AchievementService {

    //Create achievement
    public AchievementModel create(AchievementModel newAchievement);

    //Get all achievements
    public List<AchievementModel> getAll();

    //Get an achievement by id
    public AchievementModel getById(Long id);

    //Patch an achievement by id
    public AchievementModel patchById(Long id, AchievementModel newData);

    //Put an achievement by id
    public AchievementModel putById(Long id, AchievementModel newData);

    //Delete an achievement by id
    public Boolean deleteById(Long id);




}

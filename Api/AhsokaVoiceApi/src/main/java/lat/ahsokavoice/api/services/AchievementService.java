package lat.ahsokavoice.api.services;

import lat.ahsokavoice.api.models.AchievementModel;
import lat.ahsokavoice.api.request.AchievementRequest;
import lat.ahsokavoice.api.response.AchievementResponse;

import java.util.List;


public interface AchievementService {

    //Create an achievement
    AchievementResponse create(AchievementRequest newAchievement);

    //Get all achievements
    public List<AchievementResponse> getAll();

    //Get an achievement by id
    public AchievementResponse getById(Long id);

    //Patch an achievement by id
    public AchievementResponse patchById(Long id, AchievementModel newData);

    //Put an achievement by id
    public AchievementResponse putById(Long id, AchievementModel newData);

    //Delete an achievement by id
    public Boolean deleteById(Long id);




}

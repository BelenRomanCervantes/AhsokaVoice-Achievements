package lat.ahsokavoice.api.services;

import lat.ahsokavoice.api.models.AchievementModel;

import java.util.Collection;

public interface AchievementService {
    public String getHello();

    public String getHello(String title);

    void createAchievement(AchievementModel achievement);

    void updateAchievement(String id, AchievementModel achievement);

    //Get
    Collection<AchievementModel> getachievement();
}

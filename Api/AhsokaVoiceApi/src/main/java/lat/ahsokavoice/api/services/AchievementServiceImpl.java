package lat.ahsokavoice.api.services;

import lat.ahsokavoice.api.models.AchievementModel;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class AchievementServiceImpl implements AchievementService {

    private static Map<Long, AchievementModel> achievementRepo = new HashMap<Long, AchievementModel>();
    static {
        AchievementModel commit = new AchievementModel(1L, "Mi primer commit");
        achievementRepo.put(commit.getId(), commit);
    }
    @Override
    public String getHello() {
        return "Hello World desde un servicio";
    }
    @Override
    public String getHello(String title) {
        return "Hello " + title;
    }

    //Create
    @Override
    public void createAchievement(AchievementModel achievement) {
        achievementRepo.put(achievement.getId(), achievement);
    }

    //Update
    @Override
    public void updateAchievement(Long id, AchievementModel achievement) {
        achievementRepo.remove(id);
        achievement.setId(id);
        achievementRepo.put(id, achievement);
    }

    //Get all
    @Override
    public Collection<AchievementModel> getAchievement() {
        return achievementRepo.values();
    }
}

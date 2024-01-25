package lat.ahsokavoice.api.services;

import lat.ahsokavoice.api.models.AchievementModel;
import lat.ahsokavoice.api.repositories.AchievementJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AchievementServiceImpl implements AchievementService {

    @Autowired
    private AchievementJpaRepository repository;

    /*private static Map<Long, AchievementModel> achievementRepo = new HashMap<Long, AchievementModel>();
    static {
        AchievementModel commit = new AchievementModel("mi primer commit");
        achievementRepo.put(commit.getId(), commit);
        AchievementModel endpoint = new AchievementModel("mi primer endpoint");
        achievementRepo.put(endpoint.getId(), endpoint);
    }*/


    //Create an achievement
    @Override
    public AchievementModel createAchievement(AchievementModel achievement) {
        return repository.save(achievement);
    }

    //Get all achievements
    @Override
    public List<AchievementModel> getAllAchievements() {
        return repository.findAll();
    }

    @Override
    public Optional<AchievementModel> updateAchiemeventById(Long id, AchievementModel request) {
        return Optional.empty();
    }


    //Update an achievement by id
    @Override
    public Optional<AchievementModel> updateAchievementById(Long id, AchievementModel achievementReceived) {
        return repository.findById(id)
                .map(achievementFound -> {
                    AchievementModel achievementToUpdate = new AchievementModel();
                    achievementFound.setTitle(achievementReceived.getTitle());
                    achievementFound.setTag(achievementReceived.getTag());
                    achievementFound.setDescription(achievementReceived.getDescription());
                    achievementFound.setImage(achievementReceived.getImage());

                    return repository.save(achievementFound);

                });
    }

    @Override
    public void updateAchievement(Long id, AchievementModel achievement) {

    }


}

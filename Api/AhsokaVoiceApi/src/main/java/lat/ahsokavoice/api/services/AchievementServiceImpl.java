package lat.ahsokavoice.api.services;

import lat.ahsokavoice.api.models.AchievementModel;
import lat.ahsokavoice.api.repositories.AchievementJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class AchievementServiceImpl implements AchievementService {

    @Autowired
    private AchievementJpaRepository repository;

    //Create an achievement
    @Override
    public AchievementModel createAchievement(AchievementModel achievement) {
        return repository.save(achievement);
    }

    //Create an image
    @Override
    public Optional<AchievementModel> saveAchievementImage(Long id, AchievementModel achievement) {
        String imageReceived = achievement.getImage();
        return repository.findById(id)
                .map(achievementFound -> {
                    achievementFound.setImage(imageReceived);
                    return repository.save(achievementFound);
                });
    }

    //Get all achievements
    @Override
    public List<AchievementModel> getAllAchievements() {
        return repository.findAll();
    }

    @Override
    public Optional<AchievementModel> updateAchiemeventById(Long id, AchievementModel achievementReceived) {
        return Optional.empty();
    }

    //Update an achievement by id
    @Override
    public Optional<AchievementModel> updateAchievementById(Long id, AchievementModel achievementReceived) {
        return repository.findById(id)
                .map(achievementFound -> {
                    achievementFound.setId_user(achievementReceived.getId_user());
                    achievementFound.setTitle(achievementReceived.getTitle());
                    achievementFound.setDate(achievementReceived.getDate());
                    achievementFound.setId_tag(achievementReceived.getId_tag());
                    achievementFound.setDescription(achievementReceived.getDescription());
                    achievementFound.setImage(achievementReceived.getImage());

                    return repository.save(achievementFound);
                });
    }

    @Override
    public Boolean deleteAchievementById(Long id) {
        repository.deleteById(id);
        return repository.findById(id)
                .map(achievementFound -> {
            return false;
            })
        .orElseGet(() -> {
            return true;
        });
}


}

package lat.ahsokavoice.api.services;

import lat.ahsokavoice.api.models.AchievementModel;
import lat.ahsokavoice.api.repositories.AchievementJpaRepository;
import lat.ahsokavoice.api.request.AchievementRequest;
import lat.ahsokavoice.api.response.AchievementResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.*;


@Service
public class AchievementServiceImpl implements AchievementService {

    @Autowired
    private AchievementJpaRepository repository;

    //Create an achievement
    @Override
    public AchievementResponse create(AchievementRequest newAchievement) {
        AchievementModel request = new AchievementModel();
        request.setId(null);
        request.setId_user(null);
        request.setTitle(newAchievement.getTitle());
        request.setDate(ZonedDateTime.now());
        request.setId_tag(newAchievement.getId_tag());
        request.setDescription(newAchievement.getDescription());
        request.setImage(newAchievement.getImage());
        AchievementModel post = repository.save(request);
        AchievementResponse response = new AchievementResponse();
        response.setId_user(post.getId_user());
        response.setTitle(post.getTitle());
        response.setDate(post.getDate());
        response.setId_tag(post.getId_tag());
        response.setDescription(post.getDescription());
        response.setImage(post.getImage());
        return response;
    }

    //Get all achievements
    @Override
    public List<AchievementResponse> getAll() {
        List<AchievementResponse> allAchievements = new ArrayList<AchievementResponse>();
        for (AchievementModel request:repository.findAll()) {
            AchievementResponse response = new AchievementResponse();
            response.setId_user(request.getId_user());
            response.setTitle(request.getTitle());
            response.setDate(request.getDate());
            response.setId_tag(request.getId_tag());
            response.setDescription(request.getDescription());
            response.setImage(request.getImage());
            allAchievements.add(response);
        }
        return allAchievements;

    }

    //Get by id
    @Override
    public AchievementResponse getById(Long id) {
        AchievementModel request = repository.findById(id).get();
        AchievementResponse response = new AchievementResponse();
        response.setId_user(request.getId_user());
        response.setTitle(request.getTitle());
        response.setDate(request.getDate());
        response.setId_tag(request.getId_tag());
        response.setDescription(request.getDescription());
        response.setImage(request.getImage());
        return response;
    }

    //Patch an achievement by id
    @Override
    public AchievementModel patchById(Long id, AchievementModel newData) {
        repository.replace(id, newData);
        return newData;
    }

    //Put an achievement by id
    @Override
    public AchievementModel putById(Long id, AchievementModel newData) {
        repository.replace(id, newData);
        return newData;
    }

    @Override
    public Boolean deleteById(Long id) {
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

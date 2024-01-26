package lat.ahsokavoice.api.request;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class AchievementRequest {


    private String title;
    private Long id_tag;
    private String description;
    private String image;

    public AchievementRequest() {

    }
    public AchievementRequest(String title, Long id_tag, String description, String image) {
        this.title = title;
        this.id_tag = id_tag;
        this.description = description;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

     public Long getId_tag() {
        return id_tag;
    }

    public void setId_tag(Long id_tag) {
        this.id_tag = id_tag;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}


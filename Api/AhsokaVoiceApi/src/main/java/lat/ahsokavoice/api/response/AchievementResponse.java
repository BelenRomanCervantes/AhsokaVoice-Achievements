package lat.ahsokavoice.api.response;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.Instant;

public class AchievementResponse {


    private Long id_user;
    private String title;
    private Instant date;
    private Long id_tag;
    private String description;
    private String image;

    public AchievementResponse() {

    }
    public AchievementResponse(Long id_user, String title, Instant date, Long id_tag, String description, String image) {
        this.id_user = id_user;
        this.title = title;
        this.date = date;
        this.id_tag = id_tag;
        this.description = description;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
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


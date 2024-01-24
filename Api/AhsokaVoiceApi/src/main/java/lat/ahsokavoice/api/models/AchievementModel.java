package lat.ahsokavoice.api.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name= "achievements")
public class AchievementModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private LocalDateTime date;
    private String tag;
    private String description;
    private String image;


    public AchievementModel() {

    }
    public AchievementModel(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public AchievementModel(LocalDateTime date, String tag, String description, String image) {
        this.date = date;
        this.tag = tag;
        this.description = description;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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

package lat.ahsokavoice.api.models;

import jakarta.persistence.*;


import java.time.ZonedDateTime;

@Entity
@Table(name= "achievements")
public class AchievementModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private Long id_user;
    private String title;
    private ZonedDateTime date;
    private Long id_tag;
    private String description;
    private String image;

    public AchievementModel() {

    }
    public AchievementModel(Long id, Long id_user, String title) {
        this.id = id;
        this.id_user = id_user;
        this.title = title;
    }

    public AchievementModel(ZonedDateTime date, Long id_tag, String description, String image) {
        this.date = date;
        this.id_tag = id_tag;
        this.description = description;
    }

    public AchievementModel(Long id, String title, String image) {
        this.id = id;
        this.title = title;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(ZonedDateTime date) {
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

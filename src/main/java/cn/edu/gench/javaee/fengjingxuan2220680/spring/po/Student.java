package cn.edu.gench.javaee.fengjingxuan2220680.spring.po;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
    private Long id;
    private String name;
    private List<String> courses;
    private Map<String, Float> scores;
    private Properties health;
    private Set<Object> items;

    // Getter 和 Setter 略

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public Map<String, Float> getScores() {
        return scores;
    }

    public void setScores(Map<String, Float> scores) {
        this.scores = scores;
    }

    public Properties getHealth() {
        return health;
    }

    public void setHealth(Properties health) {
        this.health = health;
    }

    public Set<Object> getItems() {
        return items;
    }

    public void setItems(Set<Object> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                ", scores=" + scores +
                ", health=" + health +
                ", items=" + items +
                '}';
    }
}




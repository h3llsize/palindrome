package org.shabbydev.main.user;

public class User {
    private Long Id;
    private String name;
    private Long score;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public void addScore(Long score) {
        this.score += score;
    }

    public void minusScore(Long score) {
        if(this.score - score < 0)
            this.score = 0L;
        else
            this.score -= score;
    }
}

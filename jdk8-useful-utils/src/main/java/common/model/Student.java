package common.model;

import lombok.*;
import lombok.experimental.Accessors;

//@Data
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class Student {
    private String name;
    private String job;
    private String hobby;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getJob() {
//        return job;
//    }
//
//    public void setJob(String job) {
//        this.job = job;
//    }
//
//    public String getHobby() {
//        return hobby;
//    }
//
//    public void setHobby(String hobby) {
//        this.hobby = hobby;
//    }
}
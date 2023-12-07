package supermarioClass.model;

import supermarioClass.model.challenge.Challenge;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class User
{
   private Long id;
    private String name;
    private Integer age;

    private List<Challenge> challengeList=new ArrayList<>();

    public  void  addList(Challenge challenge){
        challengeList.add(challenge);
    }

    public  void  removeList(Challenge challenge){
        challengeList.remove(challenge);
    }

    public List<Challenge> getChallengeList() {
        return challengeList;
    }

    public void setChallengeList(List<Challenge> challengeList) {
        this.challengeList = challengeList;
    }

    public User(List<Challenge> challengeList) {
        this.challengeList = challengeList;
    }



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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User(){

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", challengeList=" + challengeList +
                '}';
    }
}

package supermarioClass;

import supermarioClass.exceptions.WrongChallengeException;
import supermarioClass.model.User;
import supermarioClass.model.challenge.Challenge;
import supermarioClass.model.challenge.Challenge2;
import supermarioClass.model.challenge.Challenge3;
import supermarioClass.model.challenge.ChallengeYek;
import supermarioClass.model.level.Easy;
import supermarioClass.model.level.Hard;
import supermarioClass.model.level.Level;
import supermarioClass.service.PlayStation;
import supermarioClass.service.PlayStationHelper;

public class main {
    public static void main(String[] args) throws WrongChallengeException {
        PlayStation playStation=new PlayStation();

        //Level easy=new Easy();
       Challenge challenge1=new ChallengeYek();
        //Challenge challegenew=new ChallengeYek();
        User zahra=new User();
        //zahra.addList(challenge1);
        //zahra.addList(new Challenge3());
       // playStation.startGame(challegenew,easy,zahra);
        User ziba=new User();

        playStation.startGame(new ChallengeYek(),new Easy() , zahra);
        playStation.startGame(new Challenge2(),new Easy(),zahra);
        playStation.startGame(new Challenge3(),new Easy(),zahra);
        System.out.println("************");
        playStation.startGame(PlayStationHelper.getRandomChallenge(),new Hard(),ziba);
        playStation.startGame(PlayStationHelper.getRandomChallenge(),new Hard(),ziba);

    }
}

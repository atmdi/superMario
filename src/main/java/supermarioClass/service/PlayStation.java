package supermarioClass.service;

import supermarioClass.exceptions.WrongChallengeException;
import supermarioClass.exceptions.WrongLevelException;
import supermarioClass.model.User;
import supermarioClass.model.challenge.Challenge;
import supermarioClass.model.challenge.Challenge3;
import supermarioClass.model.level.Easy;
import supermarioClass.model.level.Hard;
import supermarioClass.model.level.Level;

public class PlayStation {
    public void startGame(Challenge challenge, Level level, User user) throws WrongChallengeException{

        if(challenge instanceof Challenge3 && level instanceof Easy) {
            throw new WrongLevelException();
        }
        if (user.getChallengeList()
                .stream()
                .anyMatch(PlayStationHelper.help(challenge.getClass().getSimpleName()))) {
            throw new  WrongChallengeException("102", "error");

        }
        challenge.action();
        level.perform();
        user.addList(challenge);
    }
}

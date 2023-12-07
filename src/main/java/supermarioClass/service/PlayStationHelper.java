package supermarioClass.service;

import supermarioClass.model.challenge.Challenge;
import supermarioClass.model.challenge.Challenge2;
import supermarioClass.model.challenge.Challenge3;
import supermarioClass.model.challenge.ChallengeYek;

import java.util.Random;
import java.util.function.Predicate;

public class PlayStationHelper {
    public static Predicate<Challenge> help(String challenge) {
        switch (challenge) {

            case "ChallengeYek" -> {
                return x -> x instanceof ChallengeYek;
            }
            case "Challenge3" -> {
                return x -> x instanceof Challenge3;
            }
            case "Challenge2" -> {
                return x -> x instanceof Challenge2;
            }

            default -> {
                return x -> x instanceof Challenge2;
            }
        }
    }

    public static Challenge getRandomChallenge() {
        Random random = new Random();
        int i = random.nextInt(4);

       return switch (i) {
            case 1 -> new ChallengeYek();
            case 2 -> new Challenge2();

            case 3, 4 -> new Challenge3();
            default -> new ChallengeYek();
        };
    }
}

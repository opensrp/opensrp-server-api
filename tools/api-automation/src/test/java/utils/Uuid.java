package utils;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class Uuid {

    public static int randomNum;

    public static int generateRandomRequestUuid() {
        randomNum = ThreadLocalRandom.current().nextInt(1, 100000000 + 1);
        return randomNum;
    }

    public static int generateRandomNumber() {
        randomNum = ThreadLocalRandom.current().nextInt(1, 100000 + 1);
        return randomNum;
    }

    public static String generateUuid() {
        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();
        return uuidAsString;
    }

}

package homework8;

import java.util.UUID;

public final class IdGenerator {

    private IdGenerator() {
    }

    public static String getUID(){

        return UUID.randomUUID().toString();

    }

}

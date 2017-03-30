package homework8.task1;

import java.util.UUID;

public final class IdGenerator {

    private IdGenerator() {
    }

    public static String getUID(){

        return UUID.randomUUID().toString();

    }

}

import DB.SQL;
import console.Console;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Console console = new Console();
        SQL.collectData();
        console.setDirection();
    }
}

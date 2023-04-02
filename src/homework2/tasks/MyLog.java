package homework2.tasks;

import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;
public class MyLog {
    static {
        try (FileInputStream in = new FileInputStream("log.config")) {
            //полный путь до файла с конфигами
            // Файл log.config всегда должен лежать в корне проекта, то есть на одном уровне с папкой src
            LogManager.getLogManager().readConfiguration();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Logger myLog (String className) {
        return Logger.getLogger(className);
    }
}

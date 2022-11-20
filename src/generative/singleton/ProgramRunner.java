package generative.singleton;
//Одиночка — это порождающий паттерн проектирования, который гарантирует, что у класса есть только один экземпляр,
// и предоставляет к нему глобальную точку доступа.
public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("Ferst");
        ProgramLogger.getProgramLogger().addLogInfo("Second");
        ProgramLogger.getProgramLogger().addLogInfo("Third");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}

package singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("Ferst");
        ProgramLogger.getProgramLogger().addLogInfo("Second");
        ProgramLogger.getProgramLogger().addLogInfo("Third");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}

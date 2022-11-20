package behavioral.command;

public class Select implements Command{
    Database database;

    public Select(Database database) {
        this.database = database;
    }

    @Override
    public void execude() {
        database.select();
    }
}

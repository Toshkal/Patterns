package behavioral.command;

public class Insert implements Command{
    Database database;

    public Insert(Database database) {
        this.database = database;
    }

    @Override
    public void execude() {
        database.insert();
    }
}

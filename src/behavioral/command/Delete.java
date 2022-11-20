package behavioral.command;

public class Delete implements Command{
    Database database;

    public Delete(Database database) {
        this.database = database;
    }

    @Override
    public void execude() {
        database.delete();
    }
}

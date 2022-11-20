package behavioral.command;

public class Update implements Command{
    Database database;

    public Update(Database database) {
        this.database = database;
    }

    @Override
    public void execude() {
        database.update();
    }
}

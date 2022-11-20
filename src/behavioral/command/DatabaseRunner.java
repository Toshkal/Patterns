package behavioral.command;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new Database();

        Developer developer = new Developer(
                new Insert(database),
                new Update(database),
                new Select(database),
                new Delete(database)
        );
        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();
    }
}

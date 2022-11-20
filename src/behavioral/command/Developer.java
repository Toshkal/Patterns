package behavioral.command;

public class Developer {
    Command insert;
    Command update;
    Command select;
    Command delete;

    public Developer(Command insert, Command update, Command select, Command delete) {
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    public void insertRecord() {
        insert.execude();
    }

    public void updateRecord() {
        update.execude();
    }

    public void selectRecord() {
        select.execude();
    }

    public void deleteRecord() {
        delete.execude();
    }
}

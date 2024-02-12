import Models.Organization;

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.readItems();
        manager.startCLI();
    }
}


interface ICommand {
    void execute();
}

class Command {
    public String name;
    public ICommand handler;

    Command(String name, ICommand handler) {
        this.name = name;
        this.handler = handler;
    }
}

class CommandHistory {
    private List<Command> commands;

    public String[] getNames() {
        return (String[]) this.commands.stream().map(c -> c.name).toArray();
    }

    public void add(Command command) {
        this.commands.add(command);
    }
}

class Manager {
    private CommandHistory history;
    private ICommandReader reader;

    public Manager() {
        this.reader = new CommandReader();
    }
    
    public void readItems() {
        this.reader.read();
    }

}

interface ICommandReader {
    void read();
    String format();
}

class Collection {
    private HashMap<Integer, Organization> organizations;
}

class CommandReader implements ICommandReader {

}
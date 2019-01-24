import java.util.Dictionary;

public class CommandsList
{
    // The reference to the main program, so we can access other classes, like Output
    private Program referenceToProgram;
    // The list of all commands
    public Dictionary<String, Command> listOfCommands = new HashTable();
    
    public CommandsList(Program program)
    {
        referenceToProgram = program;
    }
}
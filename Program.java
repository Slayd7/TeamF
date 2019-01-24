public class Program
{
    // The program contains references to all running classes
    public World world;
    public Parser parser;
    public Input input;
    public Output output;
    public CommandsList commandsList;

    public Program()
    {
        world = new World(this);
        parser = new World(this);
        input = new Input(this);
        output = new Output(this);
        commandsList = new CommandsList(this);
    }
}
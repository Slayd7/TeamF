import com.sun.tools.javac.util.List;

public abstract class Command
{
    // The reference to the main program, so we can access other classes, like Output
    private Program referenceToProgram;
    
    public Command(Program program)
    {
        referenceToProgram = program;
    }

    public abstract void Run(List<String> arguments);
}
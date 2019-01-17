#include<string>
#include "ClassDefinitions.h"
using namespace std;

// This class takes input from the Input class, parses the command and arguments, and hands them off to the proper Command class
class Parser
{
private:
    // A reference to the base program; Through this we can access any class instances we need, like Output
    Program* referenceToProgram;

public:
    Parser(Program* program)
    {
        // Establish our reference to the main program
        referenceToProgram = program;
    }
    // Parses the given string and calls the Run() function on the correct command class
    void Parse(string stringToParse)
    {
        
    }
}
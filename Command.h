#include<string>
#include "ClassDefinitions.h"
#include <map>
using namespace std;

// The base class for any command
class Command
{
private:
    // A reference to the base program; Through this we can access any class instances we need, like Output
    Program* referenceToProgram;

public:
    Command(Program* program)
    {
        // Establish our reference to the main program
        referenceToProgram = program;
    }

    virtual void Run(map<int, string> arguments)
    {
        
    }
}
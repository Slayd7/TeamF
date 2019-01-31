#include "CommandsList.h"
using namespace std;

CommandsList::CommandsList(Program* program)
{
    referenceToProgram = program;

    
    // When adding new commands, they need to be inserted into the listOfCommands here

    //listOfCommands.insert("go", new CommandGo(referenceToProgram));
}
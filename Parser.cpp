#include "Parser.h"
using namespace std;

Parser::Parser(Program* program)
{
    // Establish our reference to the main program
    referenceToProgram = program;
}
// Parses the given string and calls the Run() function on the correct command class
void Parser::Parse(string stringToParse)
{
    // Make sure our input isn't null
    if(stringToParse == "")
        return;
    // Create a list of the parsed string
    vector<string> parsedInput = ParseString(stringToParse);
}

// Parses the given string and calls the Run() function on the correct command class
vector<string> Parser::ParseString(string stringToParse)
{
    // Create a new list to return
    vector<string> parsedStringToReturn;
    size_t last = 0; 
    size_t next = 0; 
    // Loop through the string and add all the words the list
    while ((next = stringToParse.find(" ", last)) != string::npos) 
    {
         parsedStringToReturn.push_back(stringToParse.substr(last, next-last));
         last = next++; 
    } 
    parsedStringToReturn.push_back(stringToParse.substr(last));
    // Return the parsed string
    return parsedStringToReturn;
}
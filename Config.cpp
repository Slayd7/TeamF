#include "Config.h"

Config::Config() 
{
	this.config_file = NULL;
}

Config::~Config()
{
	delete this.config_file;
}

void Config::run() 
{
	// Start by reading each section of the file and asking user
	// if any changes are desired.
	

	// Finish by writing the changes back to the file.
}

bool Config::save_config_file() 
{

}

bool Config::config_exists() 
{

}

int Config::write_to_file(int file_line, string text)
{

}

fstream * Config::create_new_file()
{

}

fstream * Config::load_config_file()
{

}


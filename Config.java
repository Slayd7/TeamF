/* CS300
 * FILENAME: Config.java
 * Class: Config
 * Contributor: Alex Saber
 *
 * File Description:
 * 	- This file contains the code for the configuration of in game objects, items and interactions.
 * 	- When the program first starts it will prompt the user for an option to configure the game.
 *     	- It implements these features by first creating a settings file if one does not already exist.
 *     	  It then will load the file for reading and writing and prompt the user to make decisions about
 *     	  in game content (Not yet determined).
 *
 *     	- TODO:
 *     		- Figure out how to organize info (whether in a yaml file or plain txt)
 *     		- Figure out if Java has a way to parse yaml files simply and if not
 *     		  figure out a way to organize info in a txt file for parsing and writing.
 *     		  Note: Could also use JSON objects (might be easier)...
 *
 */

import java.io.*;

public class Config
{
    private String fileName;
    private JSONObject configObj;

    public Config() {
        this.fileName = "Config.json";

    }

    /*
        This is the main function for this class.
        Running this will take the user into the config menu and
        allow the user to read and modify the current game settings.
     */
    public void configureGame() {

    }

    /*
        This Function will be used by other classes that need access to the
        configuration that the user has set up.
        It will return a JSONObject with the game settings.
     */
    public JSONObject getConfig() {
        return null
    }

    /*
        Reads the config file and updates the JSONObject
        data member for this class.
     */
    private JSONObject readConfigFromFile() {
        return null
    }

    /*
        Writes the new user settings into the config file
        for later use.
     */
    private void writeToConfig() {

    }

    ///////////////////////
    // Handler functions //
    ///////////////////////

    /*
        Function to handle modifying the Item settings.
     */
    private void handleItemMods() {

    }

    /*
        Function to handle modifying the Obsticle settings.
     */
    private void handleObstacleMods() {

    }

    public static void main(String [] args) {
        public Config config;
        config.configureGame();
    }
}
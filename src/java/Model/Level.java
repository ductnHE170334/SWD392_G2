/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PCMSI
 */
public class Level {
    private int levelID;
    private String name, level_status;

    public Level() {
    }

    public Level(int levelID, String name, String level_status) {
        this.levelID = levelID;
        this.name = name;
        this.level_status = level_status;
    }

    public int getLevelID() {
        return levelID;
    }

    public void setLevelID(int levelID) {
        this.levelID = levelID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel_status() {
        return level_status;
    }

    public void setLevel_status(String level_status) {
        this.level_status = level_status;
    }
    
}

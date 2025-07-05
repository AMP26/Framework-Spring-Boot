package com.springboot.applicationproperties.player;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PlayerDetails {
    @Value("${first.name}")
    private String firstName;

    @Value("${last.name}")
    private String lastName;

    @Value("${team.name}")
    private String teamName;

    @Value("${game.name}")
    private String gameName;


    public String details() {
        return "Full Name: " + this.firstName + " " + this.lastName +
                "\n" + "Team: " + this.teamName +
                "\n" + "Game: " + this.gameName;
    }

}

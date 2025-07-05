package com.springboot.applicationproperties.rest;

import com.springboot.applicationproperties.player.PlayerDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationPropertiesRestController {

    @Autowired
    PlayerDetails playerDetails;

    @GetMapping("/playerdetails")
    public String detailsOfPlayer() {
        return playerDetails.details();
    }
}

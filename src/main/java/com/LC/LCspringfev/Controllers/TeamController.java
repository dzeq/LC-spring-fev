package com.LC.LCspringfev.Controllers;

import com.LC.LCspringfev.Models.Team;
import com.LC.LCspringfev.Services.TeamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class TeamController {

    private Logger logger = LoggerFactory.getLogger(TeamController.class);

    @Autowired
    private TeamService teamService;

    @GetMapping(path = "/teams")
    public List<Team> getTeams(@RequestParam(value = "sort",  required = false) Optional<String> sort) {
        logger.info("/teams called");
        if (sort.isPresent()) {
            return teamService.getAllTeams(sort.get());
        } else {
            return teamService.getAllTeams();
        }
    }
}

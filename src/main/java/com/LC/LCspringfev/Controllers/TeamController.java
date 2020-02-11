package com.LC.LCspringfev.Controllers;

import com.LC.LCspringfev.Models.Team;
import com.LC.LCspringfev.Repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    @GetMapping(path = "/teams")
    public List<Team> getTeams() {
        return teamRepository.getAllTeams();
    }

}

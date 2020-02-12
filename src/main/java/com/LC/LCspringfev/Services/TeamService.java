package com.LC.LCspringfev.Services;

import com.LC.LCspringfev.Models.Team;
import com.LC.LCspringfev.Repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public List<Team> getAllTeams(String sort) {
        List<Team> teamList = teamRepository.getAllTeams();

        if (sort.equals("desc")) {
            return teamList.stream()
                .sorted(Comparator.comparingInt(Team::getCreationYear)
                .reversed())
                .collect(Collectors.toList());
        } else {
            return teamList.stream()
                .sorted(Comparator.comparingInt(Team::getCreationYear))
                .collect(Collectors.toList());
        }
    }

    public List<Team> getAllTeams() {
        return teamRepository.getAllTeams();
    }

    public Team getTeamById(String teamId) {
        List<Team> teamsList = teamRepository.getAllTeams();

        Team t = teamsList.stream()
                .filter(v -> v.getId().equals(teamId)).findAny().orElse(null);

        return t;
    }

}

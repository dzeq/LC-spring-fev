package com.LC.LCspringfev.Repositories;

import com.LC.LCspringfev.ResponseFromAPI;
import com.LC.LCspringfev.Models.Team;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import sun.security.provider.SHA;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class TeamRepository {

    private Logger logger = LoggerFactory.getLogger(TeamRepository.class);

    @Value("${api_football_token}")
    private String apiToken;

    public List<Team> getAllTeams() {
        final String uri = "http://api.football-data.org/v2/competitions/CL/teams?season=2018";
        logger.info("API called : " + uri);
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Auth-Token",
                apiToken);

        HttpEntity<String> entity = new HttpEntity<>("body", headers);

        RestTemplate restTemplate = new RestTemplate();

        ResponseFromAPI responseFromAPI = restTemplate.exchange(uri, HttpMethod.GET, entity, ResponseFromAPI.class).getBody();
        logger.info("Nb equipe =  " + responseFromAPI.getTeams().size());
        logger.info("JSON complet " + responseFromAPI.toString());
        List<Team> list = responseFromAPI.getTeams().stream().map(
                responseTeam -> {
                    return new Team(responseTeam.getID(), responseTeam.getName(), responseTeam.getTLA(), responseTeam.getArea().getName(), responseTeam.getFounded());
                }
        ).collect(Collectors.toList());
        logger.info("Team  " + list);
        return list;
    }
}

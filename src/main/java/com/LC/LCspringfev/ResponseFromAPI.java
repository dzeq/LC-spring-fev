package com.LC.LCspringfev;

import java.util.List;

public class ResponseFromAPI {

        List<ResponseTeam> teams;

        public ResponseFromAPI() {}

        public List<ResponseTeam> getTeams() {
                return teams;
        }

        public void setTeams(List<ResponseTeam> teams) {
                this.teams = teams;
        }
}

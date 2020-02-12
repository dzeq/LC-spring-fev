package com.LC.LCspringfev;

import java.util.List;

public class ResponseFromAPI {

        List<ResponseTeam> teams;

        @Override
        public String toString() {
                return "ResponseFromAPI{" +
                        "teams=" + teams +
                        '}';
        }

        public ResponseFromAPI() {}

        public List<ResponseTeam> getTeams() {
                return teams;
        }

        public void setTeams(List<ResponseTeam> teams) {
                this.teams = teams;
        }
}

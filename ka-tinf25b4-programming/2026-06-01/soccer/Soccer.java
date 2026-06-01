package soccer;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;

public class Soccer {

    private record Player(int number, String name, String position, String birthday, String club, int games, int goals) {
        @Override
        public String toString() {
            return String.format(
                    "%2d | %s, %s, %s, %s, %d games, %d goals",
                    this.number,
                    this.name,
                    this.position,
                    this.birthday,
                    this.club,
                    this.games,
                    this.goals
            );
        }
    }

    public static void main() throws IOException, URISyntaxException {
        URL url = Soccer.class.getResource("/team-de.txt");

        List<Player> players = Files.readAllLines(Paths.get(url.toURI()))
                .stream()
                .map(line -> line.split(";"))
                .map(line -> {
                    int number = Integer.parseInt(line[0]);
                    int games = Integer.parseInt(line[5]);
                    int goals = Integer.parseInt(line[6]);
                    return new Player(number, line[1], line[2], line[3], line[4], games, goals);
                })
                .toList();

        System.out.println("Players sorted by number:");
        players.stream()
                .sorted(Comparator.comparingInt(Player::number))
                .forEach(System.out::println);

        System.out.println("Players with more than 50 games, sorted by name:");
        players.stream()
                .sorted(Comparator.comparing(Player::name))
                .forEach(System.out::println);

        System.out.println("All clubs of the players:");
        players.stream()
                .map(player -> player.club)
                .distinct()
                .forEach(System.out::println);

        long badPlayers = players.stream()
                .filter(player -> player.goals < 5)
                .count();
        System.out.println("Count of players with less than 5 goals: " + badPlayers);

        long goals = players.stream()
                .map(player -> player.goals)
                . /// TODO
    }
}

package chorona;

import java.util.HashSet;
import java.util.Set;

public class RoomSetting {
    private final int width;
    private final int height;
    private final Set<Point> pollutants = new HashSet<>();

    public RoomSetting(int width,int height, int noOfPolluters) {
        this.width = width;
        this.height = height;

        if (noOfPolluters > height*width) {
            throw new AHAException("Insufficient singers");
        }

        while (pollutants.size() < noOfPolluters) {
            pollutants.add(Point.random(width, height));
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Set<Point> getPollutants() {
        return this.pollutants;
    }
}

package Logic.Objects;



import java.util.ArrayList;


public class System {

    private int pixelX;
    private int pixelY;
    private ArrayList<Fleet> systemsFleet = new ArrayList<>();
    private ArrayList<Planets> systemsPlanets = new ArrayList<>();
    private Nation nationality;


    public System(int pixelX, int pixelY, Integer amountSystemsPlanets) {
        this.pixelX = pixelX;
        this.pixelY = pixelY;
        for (int i = 0; i < amountSystemsPlanets; i++) {
            systemsPlanets.add(new Planets());
        }
    }

    public void addFleet(Fleet fleet) {
        systemsFleet.add(fleet);
    }

    public int getPixelX() {
        return pixelX;
    }

    public int getPixelY() {
        return pixelY;
    }
    public int getPlanetAmount(){
        return systemsPlanets.size();
    }
}
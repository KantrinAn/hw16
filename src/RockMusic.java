public class RockMusic extends MusicStyle {
    public RockMusic(String band1, String band2, String band3) {
        super(band1, band2, band3);
    }

    @Override
    public void playMusic() {
        System.out.println("Rock-n-Roll never die!");
    }
}

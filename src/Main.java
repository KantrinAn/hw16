public class Main {
    public static void main(String[] args) {

        MusicStyle[] musicStyles = {
                new PopMusic("Madonna", "Lady Gaga", "Stepan Giga"),
                new RockMusic("Queen", "Three Days Grace", "Slipknot"),
                new ClassicMusic("Mozart", "Beethoven", "Leontovitch")};
        for (MusicStyle m : musicStyles) {
            m.playMusic();
        }
        }
    }



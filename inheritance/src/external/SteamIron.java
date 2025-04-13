package external;


    public class SteamIron extends Iron {
        public void spraySteam() {
            System.out.println("SteamIron: Sprays steam to remove wrinkles easily.");
        }

        @Override
        public void heat() {
            System.out.println("SteamIron: Heats and produces steam for better ironing.");
        }

}

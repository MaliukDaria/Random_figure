public enum Colour {
    RED, ORANGE, YELLOW, GREEN, BLUE, DARKBLUE, PURPLE, PINK;

    public static Colour chooseRandomColour() {
        return Colour.values()[(int) (Math.random() * (Colour.values().length))];
    }
}

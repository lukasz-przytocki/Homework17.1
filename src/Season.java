public enum Season {
    SPRING("Wiosna"),
    SUMMER("Lato"),
    AUTUMN("Jesień"),
    WINTER("Zima");

    private final String translation;

    Season(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    static Season convertFromString(String userSeason) {
        Season[] seasons = values();
        for (Season season : seasons) {
            if (season.getTranslation().equalsIgnoreCase(userSeason)) {
                return season;
            }
        }
        throw new IllegalArgumentException("value not found");
    }
}


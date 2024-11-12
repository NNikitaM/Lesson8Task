class PopulationInformer {

    public static String getPopulationPercent(Continent continent) {
        String result;

        switch (continent) {
            case Continent.ASIA:
                result = "59.5%";
                break;
            case Continent.AFRICA:
                result = "16.9%";
                break;
            case Continent.NORTH_AMERICA:
                result = "7.7%";
                break;
            case Continent.SOUTH_AMERICA:
                result = "5.6%";
                break;
            case Continent.ANTARCTICA:
                result = "<0.1%";
                break;
            case Continent.EUROPE:
                result = "9.7%";
                break;
            case Continent.AUSTRALIA:
                result = "0.5%";
                break;
            default:
                result = "Такого материка не существует.";
                break;
        }

        return result;
    }
}

enum Continent {
    ASIA,
    AFRICA,
    NORTH_AMERICA,
    SOUTH_AMERICA,
    ANTARCTICA,
    EUROPE,
    AUSTRALIA
}




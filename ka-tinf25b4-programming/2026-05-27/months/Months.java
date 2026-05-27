package months;

public enum Months {
    JANUAR("Januar", 31, "Hartung, Eismond"),
    FEBRUAR("Februar", 28, "Hornung, Schmelzmond, Taumond, Narrenmond, Rebmond, Hintester"),
    MÄRZ("März", 31, "Lenzing, Lenzmond"),
    APRIL("April", 30, "Launing, Ostermond"),
    MAI("Mai", 31, "Winnemond, Blumenmond"),
    JUNI("Juni", 30, "Brachet, Brachmond"),
    JULI("Juli", 31, "Heuert, Heumond"),
    AUGUST("August", 31, "Ernting, Erntemond, Bisemond"),
    SEPTEMBER("September", 30, "Scheiding, Herbstmond"),
    OKTOBER("Oktober", 31, "Gilbhart, Gilbhard, Weinmond"),
    NOVEMBER("November", 30, "Nebelung, Windmond, Wintermond"),
    DEZEMBER("Dezember", 31, "Julmond, Heilmond, Christmond, Dustermond");

    private String name;
    private int days;
    private String ancientNames;

    Months(String name, int days, String ancientNames) {
        this.name = name;
        this.days = days;
        this.ancientNames = ancientNames;
    }
}
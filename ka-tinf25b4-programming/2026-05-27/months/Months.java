package months;

import java.util.Calendar;

public enum Months {
    JANUARY("Januar", 31, "Hartung, Eismond"),
    FEBRUARY("Februar", 28, "Hornung, Schmelzmond, Taumond, Narrenmond, Rebmond, Hintester"),
    MARCH("März", 31, "Lenzing, Lenzmond"),
    APRIL("April", 30, "Launing, Ostermond"),
    MAY("Mai", 31, "Winnemond, Blumenmond"),
    JUNE("Juni", 30, "Brachet, Brachmond"),
    JULY("Juli", 31, "Heuert, Heumond"),
    AUGUST("August", 31, "Ernting, Erntemond, Bisemond"),
    SEPTEMBER("September", 30, "Scheiding, Herbstmond"),
    OCTOBER("Oktober", 31, "Gilbhart, Gilbhard, Weinmond"),
    NOVEMBER("November", 30, "Nebelung, Windmond, Wintermond"),
    DECEMBER("Dezember", 31, "Julmond, Heilmond, Christmond, Dustermond");

    private final String name;
    private final int days;
    private final String ancientNames;

    Months(String name, int days, String ancientNames) {
        this.name = name;
        this.days = days;
        this.ancientNames = ancientNames;
    }

    public static void main() {
        int month = Calendar.getInstance().get(Calendar.MONTH);
        Months entry = Months.values()[month];

        System.out.printf("Der %s hat %d Tage und hieß früher '%s'", entry.name, entry.days, entry.ancientNames);
    }
}
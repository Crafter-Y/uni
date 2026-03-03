package periodic;

public class PeriodicTable {
    private static final int MAX_ELEMENTS = 118;
    
    private Element[] elements = new Element[MAX_ELEMENTS];

    public void addElement(Element element) {
        elements[element.getOrdinal()-1] = element;
    }

    public boolean hasElement(int o) {
        return elements[o-1] != null;
    }

    public Element getElement(int o) {
        return elements[o-1];
    }

    public Element[] getMetals() {
        Element[] metals = new Element[MAX_ELEMENTS];

        int i = 0;
        for (Element element : elements) {
            if (element instanceof Metal) {
                metals[i] = element;
                i++;
            }
        }

        return metals;
    }

    public static void main() {
        System.out.println();
        System.out.println();

        PeriodicTable pt = new PeriodicTable();
        pt.addElement(new Element("Wasserstoff", "H", 1, 'K', 3, true));
        pt.addElement(new Element("Helium", "He", 2, 'K', 3, true));
        pt.addElement(new Metal("Natrium", "Na", 11, 'M', 1, true, false, 21 * Math.pow(10, 6)));
        pt.addElement(new Metal("Eisen", "Fe", 26, 'N', 1, false, false, 10.02 * Math.pow(10, 6)));
        pt.addElement(new Metal("Germanium", "Ge", 32, 'N', 1, false, true, 1.45));
        pt.addElement(new Element("Brom", "Br", 35, 'N', 2, true));
        pt.addElement(new Metal("Tellur", "Te", 52, 'O', 1, true, true, 0.005));
        Element gold = new Metal("Gold", "Au", 79, 'P', 1, false, false, 44 * Math.pow(10, 6));
        pt.addElement(gold);

        System.out.println("Metalle: ");
        Element[] metals = pt.getMetals();
        for (Element element : metals) {
            if (element != null) System.out.println(element);
        }
        System.out.println();

        System.out.println("Gold: ");
        System.out.println(gold);
    }
}

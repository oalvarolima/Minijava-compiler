package minijavac.Temp;


import minijavac.SemanticAnalysis.Symbol;

/**
 * A Label represents an address in assembly language.
 */

public class Label {
    private final String name;
    private static int count;

    /**
     * a printable representation of the label, for use in assembly
     * language output.
     */
    public String toString() {
        return name;
    }

    /**
     * Makes a new label that prints as "name".
     * Warning: avoid repeated calls to <tt>new Label(s)</tt> with
     * the same name <tt>s</tt>.
     */
    public Label(String n) {
        name = n;
    }

    /**
     * Makes a new label with an arbitrary name.
     */
    public Label() {
        this("\nL" + count++ + "\n");
    }

    public Label(Symbol symbol) {
        this(symbol.toString());
    }
}
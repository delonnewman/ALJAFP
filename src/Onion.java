class Onion extends ShishD {
    ShishD s;
    Onion(ShishD _s) {
        s = _s; }
    //----------------

    boolean onlyOnions() {
        return s.onlyOnions(); }

    boolean isVegetarian() {
        return s.isVegetarian(); }

    public String toString() {
        return "new " + getClass().getName() + "(" + s + ")"; }
}

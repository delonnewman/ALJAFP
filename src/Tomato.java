class Tomato extends ShishD {
    ShishD s;
    Tomato(ShishD _s) {
        s = _s; }
    //-----------------

    boolean onlyOnions() {
        return false; }

    boolean isVegetarian() {
        return s.isVegetarian(); }

    public String toString() {
        return "new " + getClass().getName() + "(" + s + ")"; }
}

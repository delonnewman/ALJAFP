class Lamb extends ShishD {
    ShishD s;
    Lamb(ShishD _s) {
        s = _s; }
    //---------------

    boolean onlyOnions() {
        return false; }

    boolean isVegetarian() {
        return false; }

    public String toString() {
        return "new " + getClass().getName() + "(" + s + ")"; }
}

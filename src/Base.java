class Base extends LayerD {
    Object o;
    Base(Object _o) {
        o = _o; }
    //---------------
    public String toString() {
        return "new " + getClass().getName() + "(" + o + ")"; }
}

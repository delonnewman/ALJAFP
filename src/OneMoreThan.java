class OneMoreThan extends NumD {
    NumD predecessor;
    OneMoreThan(NumD _p) {
        predecessor = _p; }
    //---------------------

    public String toString() {
        return "new " + getClass().getName() + "(" + predecessor + ")"; }
}

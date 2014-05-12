class Slice extends LayerD {
    LayerD l;
    Slice(LayerD _l) {
        l = _l; }
    //----------------
    public String toString() {
        return "new " + getClass().getName() + "(" + l + ")"; }
}

class CartesianPt extends PointD {
    int x;
    int y;
    CartesianPt(int _x, int _y) {
        x = _x;
        y = _y; }
    //---------------------------

    public String toString() {
        return "new " + getClass().getName() + "(" + x + ", " + y + ")"; }

    int distanceToO() {
        return (int)Math.sqrt(x*x + y*y); }
}

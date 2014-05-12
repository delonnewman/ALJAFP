class ManhattanPt extends PointD {
    int x;
    int y;
    ManhattanPt(int _x, int _y) {
        x = _x;
        y = _y; }
    //---------------------------

    public String toString() {
        return "new " + getClass().getName() + "(" + x + ", " + y + ")"; }

    int distanceToO() {
        return x + y; }
}

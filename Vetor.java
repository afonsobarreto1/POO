class Vetor {
    private double x, y;
    public Vetor(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private void check(Vetor that) {
        if (that.modulo() <= 0) {
            System.out.println("iv");
            System.exit(0);
        }
    }

    public double modulo() {
        double ax = Math.pow(x, 2.0);
        double ay = Math.pow(y, 2.0);
        return Math.sqrt(ax + ay);
    }

    public double proin (Vetor that) {
        return x * that.x + y * that.y;
    }

    public double cossine (Vetor that) {
        check(that);
        check(this);
        double pro = this.proin(that);
        double norm_u = this.modulo();
        double norm_v = that.modulo();
        double multi_norm = norm_u * norm_v;
        return pro / multi_norm;

    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}

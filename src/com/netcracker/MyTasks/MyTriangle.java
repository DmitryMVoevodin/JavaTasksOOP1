package com.netcracker.MyTasks;

public class MyTriangle {

    //Private Fields_______________________________________________________

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    //Public Methods_______________________________________________________

    public MyTriangle(){
        v1 = new MyPoint();
        v2 = new MyPoint();
        v3 = new MyPoint();
    }

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this();
        v1.setXY(x1, y1);
        v2.setXY(x2, y2);
        v3.setXY(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this();
        MyPoint v1_new = ifMyPointEqualsNull(v1);
        MyPoint v2_new = ifMyPointEqualsNull(v2);
        MyPoint v3_new = ifMyPointEqualsNull(v3);
        this.v1.setXY(v1_new.getX(), v1_new.getY());
        this.v2.setXY(v2_new.getX(), v2_new.getY());
        this.v3.setXY(v3_new.getX(), v3_new.getY());
    }

    private MyPoint ifMyPointEqualsNull(MyPoint v) {
        if (v == null) {
            return new MyPoint(0,0);
        }
        else {
            return v;
        }
    }

    @Override
    public String toString() {
        return ("Triangle[v1=" + v1.toString() + ", v2=" + v2.toString() + ", v3=" + v3.toString() + "]");
    }

    public double getPerimeter() {
        return (v1.distance(v2) + v2.distance(v3) + v3.distance(v1));
    }

    public String getType() {
        double a = v1.distance(v2);
        double b = v2.distance(v3);
        double c = v3.distance(v1);
        if ((Extra.isEqual(a, b)) && (Extra.isEqual(b, c))) {
            return "Equilateral";
        } else if((Extra.isEqual(a, b)) || (Extra.isEqual(b, c)) || (Extra.isEqual(c, a))) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    public String getTypeAngle() {
        double h, l, k;
        h = l = k = 0;
        double a_sq = Math.pow(v1.distance(v2), 2.0);
        double b_sq = Math.pow(v2.distance(v3), 2.0);
        double c_sq = Math.pow(v3.distance(v1), 2.0);
        if((a_sq > b_sq || Extra.isEqual(a_sq, b_sq)) && (a_sq > c_sq || Extra.isEqual(a_sq, c_sq))) { h = a_sq; l = b_sq; k = c_sq; }
        else if((b_sq > a_sq || Extra.isEqual(b_sq, a_sq)) && (b_sq > c_sq || Extra.isEqual(b_sq, c_sq))) { h = b_sq; l = a_sq; k = c_sq; }
        else if((c_sq > b_sq || Extra.isEqual(c_sq, b_sq)) && (c_sq > a_sq || Extra.isEqual(c_sq, a_sq))) { h = c_sq; l = b_sq; k = a_sq; }
        if(h > l + k && !Extra.isEqual(h, l + k)) { return "Obtuse"; }
        else if(Extra.isEqual(h, l + k)) { return "Right"; }
        else { return "Acute";}
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(!(obj instanceof MyTriangle)) return false;
        MyTriangle another = (MyTriangle) obj;
        return ((this.v1.equals(another.v1)) && (this.v2.equals(another.v2)) && (this.v3.equals(another.v3)) ||
                (this.v1.equals(another.v1)) && (this.v2.equals(another.v3)) && (this.v3.equals(another.v1)) ||
                (this.v1.equals(another.v2)) && (this.v2.equals(another.v1)) && (this.v3.equals(another.v3)) ||
                (this.v1.equals(another.v2)) && (this.v2.equals(another.v3)) && (this.v3.equals(another.v1)) ||
                (this.v1.equals(another.v3)) && (this.v2.equals(another.v2)) && (this.v3.equals(another.v1)) ||
                (this.v1.equals(another.v3)) && (this.v2.equals(another.v1)) && (this.v3.equals(another.v2)));
    }

    @Override
    public int hashCode() {
        //In order to consider the situation, when two triangles are equal notwithstanding the fact that
        //(obj1.v1 != obj2.v1 || obj1.v2 != obj2.v2 || obj1.v3 != obj2.v3), we must change the order of the points.
        //For example, we can use the "alphabet" order. Firstly, we sort using X-coordinates. Then we sort using Y-coordinates,
        //if x-coordinates were equal on the previous step.
        MyPoint[] vv = {new MyPoint(v1.getX(), v1.getY()), new MyPoint(v2.getX(), v2.getY()), new MyPoint(v3.getX(), v3.getY())};
        MyPoint vtmp;
        for(int j = 0; j < 2; ++j) {
            for (int i = j + 1; i < 3; ++i) {
                if (vv[j].getX() > vv[i].getX()) {
                    vtmp = vv[j];
                    vv[j] = vv[i];
                    vv[i] = vtmp;
                } else if (vv[j].getX() == vv[i].getX()) {
                    if (vv[j].getY() > vv[i].getY()) {
                        vtmp = vv[j];
                        vv[j] = vv[i];
                        vv[i] = vtmp;
                    }
                }
            }
        }
        //Further we can use the common approach.
        int result = 17;
        result = 31 * result + vv[0].hashCode(); //31 * 31 * 31?
        result = 31 * result + vv[1].hashCode(); //Maybe several times
        result = 31 * result + vv[2].hashCode(); //we should multiply by 31?
        return result;
    }

}
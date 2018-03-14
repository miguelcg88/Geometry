public class Circle {
    private double radio;
    private Point center;

    public Circle(double radio,Point center){
        this.radio = radio;
        this.center = center;
    }

    public double calculateD(Point point) {
        double d1 = Math.pow((double)point.getX()-(double)center.getX(),2);
        double d2 = Math.pow((double)point.getY()-(double)center.getY(),2);
        double d = Math.sqrt(d1+d2);
        return d;
    }

    public boolean pointInsideCircle(Point point) {
        return this.calculateD(point) < radio;
    }
    public boolean pointIsInCircle(Point point) {
        return this.calculateD(point) == radio;
    }

    public boolean lineIsInCircle(Line line){
        boolean res = false ;
    if (true){
        if (pointInsideCircle(line.getStart()) && pointInsideCircle(line.getEnd()))
            res =  true;
        if (pointIsInCircle(line.getStart()) && pointIsInCircle(line.getEnd()))
            res = true;
        if (pointIsInCircle(line.getStart()) && pointInsideCircle(line.getEnd()))
            res = true;
        if (pointIsInCircle(line.getEnd()) && pointInsideCircle(line.getStart()))
            res = true;
    }
    else{
        res =  false;
    }
    return res;
    }




}

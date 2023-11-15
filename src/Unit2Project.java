public class Unit2Project {
    private String coord1;
    private String coord2;
    private double slope;
    private double yInt;
    private double x1;
    private double x2;
    private double y1;
    private double y2;


    public Unit2Project(String c1, String c2) {
        coord1 = c1;
        coord2 = c2;
    }


    public String getCoord1() {
        return coord1;
    }


    public String getCoord2() {
        return coord2;
    }


    public void parse(String coord1, String coord2) {
        String sx1 = coord1.substring(1, coord1.indexOf(","));
        String sx2 = coord2.substring(1, coord2.indexOf(","));
        String sy1 = coord1.substring(coord1.indexOf(",") + 1, coord1.indexOf(")"));
        String sy2 = coord2.substring(coord2.indexOf(",") + 1, coord2.indexOf(")"));
        x1 = Double.parseDouble(sx1);
        y1 = Double.parseDouble(sy1);
        x2 = Double.parseDouble(sx2);
        y2 = Double.parseDouble(sy2);
    }


    public String linearEquation() {
        String y = "";
        if (x1 == (int) x1 && x2 == (int) x2 && y1 == (int) y1 && y2 == (int) y2) {
            int yv = (int) (y2 - y1);
            int xv = (int) (x2 - x1);
            slope = (double) yv / xv;
            yInt = y1 - (slope * x1);




            if (yv < 0 && xv < 0) {
                yv = Math.abs(yv);
                xv = Math.abs(xv);
                slope = (double) yv / xv;
                if (slope % 1 == 0 && yInt == 0 && slope != 0 && slope != 1 && slope != -1) {
                    slope = (int) slope;
                    y = (int) slope + "x";
                }
                if (slope % 1 == 0 && yInt > 0 && slope != 0 && slope != 1 && slope != -1) {
                    slope = (int) slope;
                    y = (int) slope + "x + " + (double) Math.round((yInt * 100)) / 100;
                }
                if (slope % 1 == 0 && yInt < 0 && slope != 0 && slope != 1 && slope != -1) {
                    slope = (int) slope;
                    y = (int) slope + "x - " + Math.abs((double) Math.round((yInt * 100)) / 100);
                }
                if (slope == 1 && yInt == 0) {
                    y = "x";
                }
                if (slope == 1 && yInt > 0) {
                    y = "x + " + yInt;
                }
                if (slope == 1 && yInt < 0) {
                    y = "x - " + Math.abs(yInt);
                }
                if (slope == -1 && yInt == 0) {
                    y = "-x";
                }
                if (slope == -1 && yInt > 0) {
                    y = "-x + " + yInt;
                }
                if (slope == -1 && yInt < 0) {
                    y = "-x - " + Math.abs(yInt);
                }
                if (yv > 0 || xv > 0) {
                    slope = (double) yv / xv;
                    if (slope % 1 == 0 && yInt == 0 && slope != 0 && slope != 1 && slope != -1) {
                        slope = (int) slope;
                        y = (int) slope + "x";
                    }
                    if (slope % 1 == 0 && yInt > 0 && slope != 0 && slope != 1 && slope != -1) {
                        slope = (int) slope;
                        y = (int) slope + "x + " + (double) Math.round((yInt * 100)) / 100;
                    }
                    if (slope % 1 != 0 && yInt == 0 && slope != 0 && slope != 1 && slope != -1) {
                        y = yv + "/" + xv + "x";
                    }
                    if (slope % 1 != 0 && yInt > 0 && slope != 0 && slope != 1 && slope != -1) {
                        y = yv + "/" + xv + "x + " + (double) Math.round((yInt * 100)) / 100;
                    }
                    if (slope % 1 == 0 && yInt < 0 && slope != 0 && slope != 1 && slope != -1) {
                        y = (int) slope + "x - " + Math.abs((double) Math.round((yInt * 100)) / 100);
                    }
                    if (slope % 1 != 0 && yInt < 0 && slope != 0 && slope != 1 && slope != -1) {
                        y = yv + "/" + xv + "x - " + Math.abs((double) Math.round((yInt * 100)) / 100);
                    }
                    if (slope == 1 && yInt == 0) {
                        y = "x";
                    }
                    if (slope == 1 && yInt > 0) {
                        y = "x + " + yInt;
                    }
                    if (slope == 1 && yInt < 0) {
                        y = "x - " + Math.abs(yInt);
                    }
                    if (slope == -1 && yInt == 0) {
                        y = "-x";
                    }
                    if (slope == -1 && yInt > 0) {
                        y = "-x + " + yInt;
                    }
                    if (slope == -1 && yInt < 0) {
                        y = "-x - " + Math.abs(yInt);
                    }
                }
                if (x1 == x2) {
                    return "These points are on a vertical line: x = " + x1;
                }
            }
            if (Math.abs((int) slope) == 0 || Math.abs(slope) == 0.0 || slope == -0.0 || (int) Math.abs(slope) == 0) {
                y = "" + yInt;
            }
        }
        return "The equation of the line between these two points is: y = " + y;
    }
    public void setCoord1(String newC1) {
        coord1 = newC1;
    }


    public void setCoord2(String newC2) {
        coord2 = newC2;
    }


    public String getSlope() {
        return "The slope of this line is: " + (double) Math.round((slope * 100)) / 100;
    }


    public String getYInt() {
        return "The y-intercept of this line is: " + (double) Math.round((yInt * 100)) / 100;
    }


    public double distance() {
        double calc = Math.hypot(x2 - x1,y2 - y1);
        return (double) Math.round(calc * 100.0) / 100.0;
    }


    public String point(double x) {
        return "The point on the line is: (" + x + ", " + ((slope * x) + yInt) + ")";
    }
}

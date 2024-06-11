package bin;

class Point { // Renamed the class to avoid conflict with java.lang.Boolean
    
    int x, y;
    
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    boolean equalsto(Point t) {
        if (this.x == t.x && this.y == t.y) { // Compare this.x and this.y with t.x and t.y
            return true;
        } else {
            return false;
        }
    }
}

class Main {

    public static void main(String[] args) {
        Point t1 = new Point(5, 6);
        Point t2 = new Point(5, 6);

        System.out.println(t2.equalsto(t1)); // This will now correctly check the equality
    }
}

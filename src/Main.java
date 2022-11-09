public class Main {
    public static void main(String[] args) {
        int walls = 4;
        int windows = 2;
        double wall_height = 2.6;
        double wall_width = 4.6;
        double window_area = 0.879*windows; //m**2 average window area
        double total_area = (walls*wall_width*wall_height) - (window_area);
        double litres = (total_area / 6.25); //6.25 is average amount of m**2 that you can paint in a litre
        System.out.println("The total amount of litres of paint you need is:" + litres);
    }
}
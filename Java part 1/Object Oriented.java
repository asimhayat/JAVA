class oops {
        public static void main(String[] args) {
            pen pen1 = new pen();
            pen1.color = "Red";
            pen1.type = "Marker";

            pen pen2 = new pen();
            pen2.color = "Black";
            pen2.type = "Pointer";


            pen1.printtype();
            pen2.printtype();
            pen1.printcolor();
            pen2.printcolor();
        }

}
class pen {
    String color;
    String type;

    public void printcolor() {
        System.out.println(color);
    }

    public void printtype() {
        System.out.println(type);
    }
}
public class Main1 {
    public static void main(String[] args) {
        Rectangle firstRectangle = new  Rectangle ();
        System.out.println("The first Rectangle ");
        firstRectangle.length = 6;
        firstRectangle.width = 7;
        firstRectangle.info();
        firstRectangle.Perimeter();
        firstRectangle.Air();
        firstRectangle.Iscarre();

        Rectangle secondRectangle = new Rectangle();
        System.out.println("\nThe second Rectangle ");
        secondRectangle.length = 15;
        secondRectangle.width = 30/2;
        secondRectangle.info();
        secondRectangle.Perimeter();
        secondRectangle.Air();
        secondRectangle.Iscarre();

        Rectangle thirdRectangle = new Rectangle();
        System.out.print("\nThe third Rectangle");
        secondRectangle.length = 90;
        secondRectangle.width = 15*6;
        secondRectangle.info();
        secondRectangle.Perimeter();
        secondRectangle.Air();
        secondRectangle.Iscarre();
    }
}

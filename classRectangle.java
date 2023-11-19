public class Rectangle {
    int length;
    int width;

    void Perimeter (){
        System.out.print("the perimeter is :");
        System.out.println((length+width)*2);
    }
    void Air (){
        System.out.print("the Air is :");
        System.out.println(length*width);
    }
    void Iscarre(){
        if (width == length) {
            System.out.println("it is a square .");
        } else {
            System.out.println("it is not a square .");
        }
    }
    void info (){
        System.out.println("Length :" + length);
        System.out.println("Width :" + width);
    }
}

public class Rectangle {
    int w;
    int h;

    int area(){
        return w * h;
    }

    int perimeter(){
        return 2 * (w + h);
    }

    void print(){
        System.out.println("w= " + w + " h= " + h + "area= " + area() + "per= " + perimeter());
    }
}

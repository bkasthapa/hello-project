class RectangleArea {
int length;
  int breadth;
  RectangleArea(int l, int b){
    length = l;
    breadth = b;
  }
  int getArea(){
    return length*breadth;
  }
   int getPerimeter(){
    return 2*(length+breadth);
  }

  public static void main(String[] args){
    RectangleArea a = new RectangleArea(2,4);
    RectangleArea b = new RectangleArea(3,6);
    System.out.println(a.getArea());
    System.out.println(a.getPerimeter());
  }
}




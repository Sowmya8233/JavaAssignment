import java.util.*;

abstract class Shapes{
	abstract void draw();
}

class line extends Shapes{
	void draw() {
		System.out.println("Draw lines");
	}
}

class Rectangle extends Shapes{
	void draw() {
		System.out.println("Draw Rectangle");
	}
}

class Cube extends Shapes{
	void draw() {
		System.out.println("Draw Cube");
	}
}
public	class DrawShape {

	public static void main(String[] args) {
		
     Shapes s;
     s=new line();
     s.draw();
     
     s=new Rectangle();
     s.draw();
     
     s=new Cube();
     s.draw();
	}

}



class Shape {
	protected int x = 44, y = 55;
	public void draw() {
		System.out.println("Shape Draw");
	}
	public void get_value() {
		// TODO Auto-generated method stub
		this.x = x;
		this.y = y;
	}
}

class Rectangle extends Shape {
	private int width = 10, height = 20;
	public void get_value() {
		super.x = width;
		super.y = height;
		System.out.println("x = " + x + " y = " + y);
	}
	public void draw() {
		System.out.println("Rectangle Draw");
	}
}

class Triangle extends Shape {
	private int base = 30, height = 40;
	public void get_value() {
		super.x = base;
		super.y = height;
		System.out.println("x = " + x + " y = " + y);
	}
  	public void draw() {
		System.out.println("Triangle Draw");
	}
}
  
class Circle extends Shape {
	private int radius = 50;
	public void get_value() {
		super.x = radius;
		super.y = 0;
		System.out.println("x = " + x + " y = " + y);
	}
  
	public void draw() {
		System.out.println("Circle Draw");
	}
}





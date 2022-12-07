package Turtle;

import ch.aplu.turtle.Turtle;

public class Kreis {

	public static void main(String[] args) {
		Turtle julian = new Turtle();
		julian.speed(10000);
		julian.rightCircle(50);
		julian.leftCircle(50);
		julian.penUp();
		julian.moveTo(50, 50);
		julian.penDown();
		julian.left(45);
		julian.forward(100);
		julian.leftArc(50, 180);
		julian.forward(100);
		julian.penUp();
		julian.moveTo(50, 150);
		julian.penDown();
		julian.left(135);
		julian.forward(100);
		julian.penUp();
		julian.moveTo(0, 200);
		julian.penDown();
		julian.left(225);
		julian.forward(25);
		julian.ht();

	}

}

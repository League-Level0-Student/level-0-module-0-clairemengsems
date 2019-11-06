package _02_robot_graffiti;
import org.jointheleague.graphical.robot.Robot;
public class RobotGrafitti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Robot yee = new Robot ();

yee.hide();
yee.penDown();
yee.setSpeed(100);
yee.move(150);
yee.turn(90);
yee.move(80);
yee.penUp();
yee.turn(90);
yee.move(150);
yee.penDown();
yee.turn(90);
yee.move(80);

	}

}

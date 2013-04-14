package ass6;
import bus.uigen.ObjectEditor;
import ass6.Home;

public class Driver {

	public static void main(String[] args) {
		Home home1 = new Home();
//		ObjectEditor.edit(home1);
//		HomeClass home2 = new HomeClass();

//		move the avatar relative
//		moveTO
		home1.getAvatar().changeLocation(15, -15);
//		test the avatar
		AvatarTester aT = new AvatarTester();
		aT.test(home1.getAvatar());
		
		
		ObjectEditor.edit(home1);
//		Oval circle = new Oval();
//		ObjectEditor.edit(circle);
//   test
	}

}

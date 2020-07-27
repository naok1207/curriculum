package check;

import constants.Constants;

public class Check {
	// 変数 firstName, lastName を自身の名前で初期化
	private static String firstName = "東";
	private static String lastName = "直希";

	public static void main(String[] args) {
		System.out.print("printNameメソッド → ");
		Check.printName();

		// Petクラスをインスタンス化したインスタンス変数petを作成 引数はConstantsクラスの定数を利用
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		// Petクラスで定義されているintroduceメソッドを利用して自己紹介文を出力
		pet.introduce();

		// Petクラスを継承したRobotPetクラスをインスタンス化したインスタンス変数roboを作成 引数はConstantsクラスの定数を利用
		RobotPet robo = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		// RobotPetクラスで再定義されているintroduceメソッドを利用して自己紹介文を出力
		robo.introduce();
	}

	// 変数 firstName, lastName を連結して表示させる printNameメソッドを作成
	private static void printName() {
		System.out.println(firstName + lastName);
	}

}

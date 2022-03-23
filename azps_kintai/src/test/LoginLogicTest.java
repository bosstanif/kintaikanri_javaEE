//OK確認03/23
package test;

import model.AccountBeans;
import model.Login;
import model.LoginLogic;

public class LoginLogicTest {
	public static void main(String[] args) {
		testExecute1(); // ログイン成功のテスト
		testExecute2(); // ログイン失敗のテスト
	}

	public static void testExecute1() {
		Login login = new Login("01", "testpass01");
		LoginLogic bo = new LoginLogic();
		AccountBeans accountBeans = bo.execute(login);
		if (accountBeans != null) {
			System.out.println("testExcecute1:成功しました");
		} else {
			System.out.println("testExcecute1:失敗しました");
		}
	}

	public static void testExecute2() {//パス違い
		Login login = new Login("01","pass01");
		LoginLogic bo = new LoginLogic();
		AccountBeans accountBeans = bo.execute(login);
		if (accountBeans == null) {
			System.out.println("testExcecute2:成功しました");
		} else {
			System.out.println("testExcecute2:失敗しました");
		}
	}
}
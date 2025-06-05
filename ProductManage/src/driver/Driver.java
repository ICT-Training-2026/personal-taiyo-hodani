package driver;

import store.SpecialProduct;

/**
 * 実行用クラス
 * @author M.Takahashi
 */
public class Driver {
	/**
	 * メインメソッド
	 * @param args 未使用
	 */
	public static void main(String[] args) {
		// インスタンス化＋初期化
		SpecialProduct keyboard = new SpecialProduct();
		keyboard.setName("特価キーボード");		// スーパークラスのメンバ
		keyboard.setPrice(3600);				// スーパークラスのメンバ
		keyboard.setOrgPrice(4500);				// サブクラスのメンバ

		// 情報表示
		System.out.println();
		keyboard.display();						// スーパークラスのメンバ
		keyboard.displayOrgPrice();				// サブクラスのメンバ
	}
}
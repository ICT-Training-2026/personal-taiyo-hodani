package store;

/**
 * 特価商品クラス
 * orgPrice
 * getset display
 */
public class SpecialProduct extends Product {
	/******** フィールド ******************************************/
	/**
	 * 定価
	 */
	private int orgPrice;

	/******** メソッド ******************************************/
	/*--------------------getter/setter--------------------*/
	/**
	 * フィールドに値を設定
	 * @return orgPrice
	 */
	public int getOrgPrice() {
		return orgPrice;
	}

	/**
	 * フィールドの値を取得
	 * @param orgPrice セットする orgPrice
	 */
	public void setOrgPrice(int orgPrice) {
		this.orgPrice = orgPrice;
	}

	/*--------------------通常メソッド--------------------*/
	/**
	 * 定価表示
	 */
	public void displayOrgPrice() {
		System.out.println("定価：" + orgPrice + "円");
	}

}

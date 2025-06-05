package store;

/**
 * 商品クラス
 * name price
 * get,set(name,price) up down display
 */
public class Product {
	/******** フィールド ******************************************/
	/**
	 * 商品名
	 */
	private String name;

	/**
	 * 価格
	 */
	private int price;

	/******** メソッド ******************************************/
	/*--------------------getter/setter--------------------*/
	/**
	 * フィールド name の値を取得する
	 * @return フィールド name
	 */
	public String getName() {
		return name;
	}

	/**
	 * フィールド name の値を設定する
	 * @param name 設定する name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * フィールド price の値を取得する
	 * @return price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * フィールド price の値を設定する
	 * @param price セットする price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/*--------------------通常メソッド--------------------*/
	/**
	 * 値上げする
	 * @param amt 値上げ金額
	 * @return 値上げ後の価格
	 */
	public int up(int amt) {
		return price += amt;
	}
	
	/**
	 * 値下げする
	 * @param amt 値下げ金額
	 * @return 値下げ後の価格
	 */
	public int down(int amt) {
		return price -= amt;
	}

	/**
	 * 情報表示
	 */
	public void display() {
		System.out.println(name + "：" + price + "円");
	}
}

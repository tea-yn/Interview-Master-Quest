package model;

//ユーザーの情報を保持するクラス
public class User {
	
	//フィールド
	private int id;	//ユーザーID
	private String hn;	//ニックネーム
	private int highest_score;	//最高スコア

	
	//コンストラクタ
	public User(int id, String hn) {
		this.id = id;
		this.hn = hn;
	}
	
	public User(String hn, int highest_score) {
		this.hn = hn;
		this.highest_score = highest_score;
	}
	
	//getter/setter
	public String getHn() {
		return hn;
	}
	public void setHn(String hn) {
		this.hn = hn;
	}
	
	public int getHighest_score() {
		return highest_score;
	}
	public void setHighest_score(int highest_score) {
		this.highest_score = highest_score;
	}
}

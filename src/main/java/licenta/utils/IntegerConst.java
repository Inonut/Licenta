package licenta.utils;



public enum IntegerConst {

	TRANSLATION(10);
	
	private int val;
	
	private IntegerConst(int val){
		this.val=val;
	}
	
	public int getVal() {
		return val;
	}
}

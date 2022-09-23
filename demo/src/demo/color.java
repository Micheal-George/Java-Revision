package demo;

public enum color {

Red(5),Blue(10),Geen(20){
	@Override
	void show() {
		System.out.println("mon");
	}
};
	int s;
	private color(int s) {
		this.s = s;
	}
	void show() {
		System.out.println(this);
	}
	public static void main(String[] args) {
		color[] c=color.values();
		for(color r:c)
			r.show();
	}
}

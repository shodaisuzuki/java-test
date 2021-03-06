// import java.util.*;
public class Cleric {
	String name;
	int hp = 50;
	static final int MAX_HP = 50;
	int mp = 10;
	static final int MAX_MP = 10;

	void selfAid() {
		this.mp -= 5;
		this.hp = 100;
		System.out.println("MPが5減り、HPが100になった");
	}

	public int play(int sec) {

		int recover = new java.util.Random().nextInt(3) + sec;

		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);

		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復");

		return recoverActual;
	}

	public Cleric(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		// System.out.println("名前:"+ name + "MP:" + mp + "HP:"+ hp);
	}

	public Cleric(String name, int hp) {
		this(name, hp, Cleric.MAX_MP);
		// System.out.println("名前:"+ name + "MP:" + MAX_HP + "HP:"+ hp);
	}

	public Cleric(String name) {
		this(name, MAX_HP);
		// System.out.println("名前:"+ name + "MP:" + MAX_HP + "HP:"+ MAX_MP);
	}
}
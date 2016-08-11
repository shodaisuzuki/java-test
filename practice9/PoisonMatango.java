public class PoisonMatango extends Matango {
	private int poisonCount = 5;

	public PoisonMatango(char suffix) {
		super(suffix);
	} 

	public void attack(Helo h) {
		super.attack(h);
		if (this.poisonCount > 0) {
			System.out.println("更に毒の胞子をばらまいた");
			int dmg = h.getHp() / 5 ;
			h.setHp(h.getHp() - dmg);
			System.out.println(dmg + "のダメージ");
			this.poisonCount -- ;
		}
	}
}
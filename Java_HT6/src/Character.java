
public class Character {
	public WeaponBehavior weapon;
	public Character(){
		double ran = Math.floor(Math.random()*4);
		WeaponBehavior w = null;
		if(ran == 0){
			w = new SwordBehavior();
		}
		if(ran == 1){
			w = new AxeBehavior();
		}
		if(ran == 2){
			w = new ClubBehavior();
		}
		if(ran == 3){
			w = new KnifeBehavior();
		}
		if(w != null){this.setWeapon(w);}
		
	}
	public void fight(){}
	public void setWeapon(WeaponBehavior w) {

		this.weapon = w;

	}
}

package spring.core.ch01.ex01;

public class Shooter {
	private Gun gun;//인터페이스로준다.
	
	public Shooter(Gun gun) {
		this.gun = gun;
	}
	
	public void setGun(Gun gun) {
		this.gun = gun;
	}
	
	public void fire() {
		gun.fire();
	}
}

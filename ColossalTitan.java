package game.engine.titans;

public class ColossalTitan extends Titan {
private int  TITAN_CODE;

public ColossalTitan(int baseHealth, int baseDamage, int heightInMeters, int distanceFromBase, int speed,
		int resourceValue, int dangerLevel) {
	super(baseHealth, baseDamage, heightInMeters, distanceFromBase, speed, resourceValue, dangerLevel);
	this.TITAN_CODE=4;
}


public int compareTo(Titan o) {
	
	return super.compareTo(o);
}


public int getBaseHealth() {
	
	return super.getBaseHealth();
}


public int getCurrentHealth() {
	
	return super.getCurrentHealth();
}


public void setCurrentHealth(int currentHealth) {
	
	super.setCurrentHealth(currentHealth);
}


public int getBaseDamage() {
	
	return super.getBaseDamage();
}

public int getHeightInMeters() {
	
	return super.getHeightInMeters();
}


public int getDistanceFromBase() {
	
	return super.getDistanceFromBase();
}


public void setDistanceFromBase(int distanceFromBase) {
	
	super.setDistanceFromBase(distanceFromBase);
}


public int getSpeed() {
	
	return super.getSpeed();
}


public void setSpeed(int speed) {
	
	super.setSpeed(speed);
}


public int getResourceValue() {
	
	return super.getResourceValue();
}

public int getDangerLevel() {
	
	return super.getDangerLevel();
}



}

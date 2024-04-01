package game.engine.titans;

public class PureTitan extends Titan {
	private int TITAN_CODE;

	public PureTitan(int baseHealth, int baseDamage, int heightInMeters, int distanceFromBase, int speed,
			int resourceValue, int dangerLevel) {
		super(baseHealth, baseDamage, heightInMeters, distanceFromBase, speed, resourceValue, dangerLevel);
		this.TITAN_CODE=1;
		}

	
	public int compareTo(Titan o) {
		// TODO Auto-generated method stub
		return super.compareTo(o);
	}

	public int getBaseHealth() {
		// TODO Auto-generated method stub
		return super.getBaseHealth();
	}

	
	public int getCurrentHealth() {
		// TODO Auto-generated method stub
		return super.getCurrentHealth();
	}

	@Override
	public void setCurrentHealth(int currentHealth) {
		// TODO Auto-generated method stub
		super.setCurrentHealth(currentHealth);
	}

	@Override
	public int getBaseDamage() {
		// TODO Auto-generated method stub
		return super.getBaseDamage();
	}

	@Override
	public int getHeightInMeters() {
		// TODO Auto-generated method stub
		return super.getHeightInMeters();
	}

	@Override
	public int getDistanceFromBase() {
		// TODO Auto-generated method stub
		return super.getDistanceFromBase();
	}

	@Override
	public void setDistanceFromBase(int distanceFromBase) {
		// TODO Auto-generated method stub
		super.setDistanceFromBase(distanceFromBase);
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return super.getSpeed();
	}

	@Override
	public void setSpeed(int speed) {
		// TODO Auto-generated method stub
		super.setSpeed(speed);
	}

	@Override
	public int getResourceValue() {
		// TODO Auto-generated method stub
		return super.getResourceValue();
	}

	@Override
	public int getDangerLevel() {
		// TODO Auto-generated method stub
		return super.getDangerLevel();
	}
	

}

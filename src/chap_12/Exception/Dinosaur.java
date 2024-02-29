package chap_12.Exception;

public class Dinosaur {

	
	int happyPoint;
	int healthyPoint;
	int safetyPoint;
	
	
	
	void setHappyPoint(int happyPoint) throws DinosaurHappyException1, DinosaurHappyException2, DinosaurHappyException3 {
		if (happyPoint < 0) throw new DinosaurHappyException1();
		else if (happyPoint < 30) throw new DinosaurHappyException2();
		else if (happyPoint > 100) throw new DinosaurHappyException1();
		else if (happyPoint >= 30 && happyPoint <=100) throw new DinosaurHappyException3();
		this.happyPoint = happyPoint;
	}
	
	int getHappyPoint() {
		return this.happyPoint;
	}
	
	void setHealthyPoint(int healthyPoint)  throws DinosaurIllException1, DinosaurIllException2, DinosaurIllException3 {
		if (healthyPoint < 0) throw new DinosaurIllException1();
		else if (healthyPoint < 3) throw new DinosaurIllException2();
		else if (healthyPoint > 10) throw new DinosaurIllException1();
		else if (healthyPoint >= 3 && healthyPoint <=10) throw new DinosaurIllException3();
		this.healthyPoint = healthyPoint;
	}
	
	int getHealthyPoint() {
		return this.healthyPoint;
	}
	
	void setSafetyPoint(int safetyPoint) throws DinosaurSafetyException1, DinosaurSafetyException2, DinosaurSafetyException3 {
		if (safetyPoint < 0) throw new DinosaurSafetyException1();
		else if (safetyPoint < 5) throw new DinosaurSafetyException2();
		else if (safetyPoint > 10) throw new DinosaurSafetyException1();
		else if (safetyPoint >= 5 && safetyPoint <=10) throw new DinosaurSafetyException3();
		this.safetyPoint = safetyPoint;
	}
	
	int getSafetyPoint() {
		return this.safetyPoint;
	}
	
	
}

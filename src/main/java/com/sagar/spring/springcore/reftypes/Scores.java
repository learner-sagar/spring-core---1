package com.sagar.spring.springcore.reftypes;

public class Scores {
	private int physics;
	private int chemistry;
	private int maths;

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	@Override
	public String toString() {
		return "Scores [physics=" + physics + ", chemistry=" + chemistry + ", maths=" + maths + "]";
	}

}

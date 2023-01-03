package com.springframework.autowiring.bytype.beanfactory;

// Auto-Wiring (byType)
// Setter Based Injection

public class Policy {

	// Declare

	private String planName;
	private String planAmount;

	// Use Getter & Setter

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanAmount() {
		return planAmount;
	}

	public void setPlanAmount(String planAmount) {
		this.planAmount = planAmount;
	}

	// Use toString Method

	@Override
	public String toString() {
		return "Policy [planName=" + planName + ", planAmount=" + planAmount + "]";
	}

}

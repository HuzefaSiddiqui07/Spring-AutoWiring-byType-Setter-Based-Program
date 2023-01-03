package com.springframework.autowiring.bytype.beanfactory;

//Auto-Wiring (byType)
//Setter Based Injection

public class Categories {

	private String name;
	private Policy policy; // Secondary DataType

	// Use Getter & Setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Policy getPolicy() {
		return policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

	// Use toString Method

	@Override
	public String toString() {
		return "Categories [name=" + name + ", policy=" + policy + "]";
	}

	// Create Method

	public void show() {

		System.out.println("Categories Name > " + name);
		System.out.println("Policy Name > " + policy.getPlanName());
		System.out.println("Policy Amount > " + policy.getPlanAmount());

	}

}

package com.hospitalmanagement.billing;

public class BronzePlan extends HealthInsurancePlan {
	private final double COVERAGE = 0.6;
	
	public BronzePlan() {
		setCoverage(COVERAGE);
	}

	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		// TODO Auto-generated method stub
		return salary * 0.05 + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}
}

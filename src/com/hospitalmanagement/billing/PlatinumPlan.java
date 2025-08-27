package com.hospitalmanagement.billing;

public class PlatinumPlan extends HealthInsurancePlan {
	private final double COVERAGE = 0.9;
	
	public PlatinumPlan() {
		setCoverage(COVERAGE);
	}

	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		// TODO Auto-generated method stub
		return salary * 0.08 + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}
}

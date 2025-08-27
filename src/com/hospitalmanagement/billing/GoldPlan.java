package com.hospitalmanagement.billing;

public class GoldPlan extends HealthInsurancePlan {
	private final double COVERAGE = 0.8;
	
	public GoldPlan() {
		setCoverage(COVERAGE);
	}

	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		// TODO Auto-generated method stub
		return salary * 0.07 + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}
}

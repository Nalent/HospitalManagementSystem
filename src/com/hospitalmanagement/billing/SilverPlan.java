package com.hospitalmanagement.billing;

public class SilverPlan extends HealthInsurancePlan {
	private final double COVERAGE = 0.7;
	
	public SilverPlan() {
		setCoverage(COVERAGE);
	}

	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		// TODO Auto-generated method stub
		return salary * 0.06 + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}
}

package com.hospitalmanagement.billing;

//You can ignore this class. It just represents an Insurance Company
interface InsuranceBrand {
	
	public double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean smoking);
}

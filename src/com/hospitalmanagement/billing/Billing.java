package com.hospitalmanagement.billing;

import com.hospitalmanagement.users.Patient;

public class Billing {

	public static double[] computePaymentAmount(Patient patient, double amount) {
		double[] payments = new double[2];
		double patientPay = amount;
		double insurancePay = 0;

		HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();

		// your logic
		if (patientInsurancePlan != null) {
			insurancePay = getInsurancePay(patientInsurancePlan, amount);

			if (patientInsurancePlan instanceof PlatinumPlan) {
				patientPay -= insurancePay + 50;
			} else if (patientInsurancePlan instanceof GoldPlan) {
				patientPay -= insurancePay + 40;
			} else if (patientInsurancePlan instanceof SilverPlan) {
				patientPay -= insurancePay + 30;
			} else if (patientInsurancePlan instanceof BronzePlan) {
				patientPay -= insurancePay + 25;
			}
		}else {
			patientPay -= 20;
		}
		
		payments[0] = insurancePay;
		payments[1] = patientPay;

		return payments;
	}

	private static double getInsurancePay(HealthInsurancePlan patientInsurancePlan, double amount) {
		return amount * patientInsurancePlan.getCoverage();
	}

}
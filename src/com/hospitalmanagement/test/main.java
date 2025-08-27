package com.hospitalmanagement.test;

import com.hospitalmanagement.billing.Billing;
import com.hospitalmanagement.billing.HealthInsurancePlan;
import com.hospitalmanagement.billing.PlatinumPlan;
import com.hospitalmanagement.users.Patient;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HealthInsurancePlan insurancePlan = new PlatinumPlan();        
		Patient patient = new Patient();
		patient.setInsurancePlan(insurancePlan);
		        
		double[] payments = Billing.computePaymentAmount(patient, 1000.0);
		for (double payment : payments) {
			System.out.println(" :" + payment);
		}

	}

}

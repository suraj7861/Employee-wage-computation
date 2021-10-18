package com.employeeWage;

public interface ComputeEmpWage {
	public void addComapanyEmpWage(String company, int empWagePerHr, int workingDayPerMonth, int maxHrsInMonth);
	public void empWageCalculation();

}

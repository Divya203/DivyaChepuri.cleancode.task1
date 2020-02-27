package com.divya.cleancode.task2;

abstract class CalculateInterests {
	protected Double principleAmount;
    protected Integer timeInterval;
    protected Double rateOfInterest;
 
    CalculateInterests(Double principleAmount,Integer timeInterval,Double rateOfInterest){
    	 this.principleAmount = principleAmount;
         this.timeInterval = timeInterval;
         this.rateOfInterest =rateOfInterest;
    }
	abstract Float calculateInterest();

}

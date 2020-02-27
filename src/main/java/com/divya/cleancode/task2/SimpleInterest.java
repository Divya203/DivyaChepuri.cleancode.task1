package com.divya.cleancode.task2;

class SimpleInterest extends CalculateInterests{
	SimpleInterest(Double principleAmount,Integer timeInterval,Double rateOfInterest){
		super(principleAmount,timeInterval,rateOfInterest);
	}
         Float calculateInterest() {
        	 return (float) ((principleAmount*timeInterval*rateOfInterest)/100);
         }
}

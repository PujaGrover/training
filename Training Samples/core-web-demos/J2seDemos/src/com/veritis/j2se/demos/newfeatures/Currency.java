package com.veritis.j2se.demos.newfeatures;
public enum Currency {
        PENNY(1), NICKLE(5), DIME(10), QUARTER(25),DOLLAR(100);
        private int value;

        private Currency(int value) {
                this.value = value;
        }
        public int getValue(){
        	return value;
        }
        
};   


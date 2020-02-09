package com.mahesh.epam.maven.oop;
import java.util.ArrayList;
import java.util.Collections;

class Gifts implements GiftMethods{
	ArrayList<Sweets> sweets; 
	ArrayList<Chocolates> chocos;
	ArrayList<Candies> candies;
	float totalweight;
    Gifts(ArrayList<Sweets> sweets,ArrayList<Chocolates> chocos,ArrayList<Candies> candies){
    	this.chocos=chocos;
    	this.sweets=sweets;
    	this.candies=candies;
    }
	public int totWeight() {
		float s=0;
		for (Sweets i: sweets){
			s+=i.n*i.weight;}
		for(Chocolates i: chocos) {
			s+=i.n*i.weight;
		}
		for(Candies i: candies) {
			s+=i.n*i.weight;
		}
		this.totalweight=s;
		return (int)s;
	}
	public void sortChoco(String option) {
		if(option.compareTo("Weight")==0) {
			Collections.sort(chocos,new SortByWeight()); // sorting candies by weight
			System.out.println("Chocolates in giftbox sorted on the weight: ");
        	for(Chocolates j: chocos) {
        		System.out.println(j.weight);}
		}
		if(option.compareTo("Price")==0) {
			Collections.sort(chocos,new SortByPrice()); // sorting candies by price
			System.out.println("Chocolates in giftbox sorted on the price:");
	        	for(Chocolates j: chocos) {
	        		System.out.println(j.price);}
	}

  }
	public void rangeCandies(String option, float lower, float higher) {
		int k=1;
		if(option.compareTo("Weight")==0) {
			System.out.println("Candies in giftbox between "+lower+" "+higher);
        	for(Candies j: candies) {
        		if(j.weight>=lower && j.weight<=higher) {
        			System.out.println("Candy "+k+" with weight "+ j.weight);}
        		k++;
        		}
		}
		if(option.compareTo("Price")==0) {
			System.out.println("Candies in giftbox  between "+lower+" "+higher);
        	for(Candies j: candies) {
        		if(j.price>=lower && j.price<=higher) {
        			System.out.println("Candy "+k+" with price "+ j.price);}
        		k++;
        		}
		}

	}
}
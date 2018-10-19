package com.cinemas.domain;

//交易
public class Transaction {

	private final Trader trader;//交易員
	private final int year;
	private final int value;
	public Transaction(Trader trader, int year, int value){
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader(){
		return this.trader;
	}
	public int getYear(){
		return this.year;
	}
	public int getValue(){
		return this.value;
	}
	public String toString(){
		return "{" + this.trader + ", " +
		"year: "+this.year+", " +
		"value:" + this.value +"}";
	}
}
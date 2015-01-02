package Money;

class Franc extends Money{
	
	Franc(int amount, String currency) {
		super(amount, currency);
	}
	
	String currency() {
		return currency;
	}
	
	static Money franc(int amount){
		return new Money(amount, "CHF");
	}
}

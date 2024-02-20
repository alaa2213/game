package guc.supermarket.products;

public class Beverage extends GroceryProduct{
	
	private SugarLevel sugarLevel;

	
 Beverage(String name,double price,double discount,SugarLevel sugarLevel) {
	super( name, price, discount);
	this.sugarLevel=sugarLevel;
	
}

String getname(){
return super.getName();
}
void setName(String name){
super.setName(name);
}


public double getPrice() {
	return super.getPrice();
}
void setPrice(double price) {
	super.setPrice(price);
}
 
public SugarLevel getSugarLevel() {
	return sugarLevel;
}

void setSugarLevel(SugarLevel s) {
this.sugarLevel=s;
}
void setDiscount(double discount) {
	super.setDiscount(discount);;
}
public String toString() {
	return super.toString()+'\n'+"SugarLevel:"+this.getSugarLevel();
}
}


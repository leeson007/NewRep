package demo;
/*
 *  Java语言中枚举属于构造类型，它用于声明一组已经定义的对象，当一个变量有几种可能的取值时，可以将他定义为枚举类型。
 * 	例如：假如有一个宠物店，但对这个宠物店有以下需求，店里的宠物只能有猴子、小狗、小猫三种宠物，当然这样的需求对于传统的类也可以实现，
 *		无非就是在实例化某个宠物时，对宠物的名字做检查，如果不符合需求可以抛出异常等，相对枚举来说，枚举可以很简单完成这样的需求。
 */
public class EnumDemo {
	public static void main(String []args){
		Pet dog=Pet.DOG;
	}
}
enum Pet{//枚举
	DOG("dog",15),CAT("cat",16),MONKEY("monkey",20);
	private  String name;
	private float price;
	private Pet(String name,float price){
		this.setName(name);
		this.setPrice(price);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}

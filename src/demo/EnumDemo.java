package demo;
/*
 *  Java������ö�����ڹ������ͣ�����������һ���Ѿ�����Ķ��󣬵�һ�������м��ֿ��ܵ�ȡֵʱ�����Խ�������Ϊö�����͡�
 * 	���磺������һ������꣬���������������������󣬵���ĳ���ֻ���к��ӡ�С����Сè���ֳ����Ȼ������������ڴ�ͳ����Ҳ����ʵ�֣�
 *		�޷Ǿ�����ʵ����ĳ������ʱ���Գ������������飬�����������������׳��쳣�ȣ����ö����˵��ö�ٿ��Ժܼ��������������
 */
public class EnumDemo {
	public static void main(String []args){
		Pet dog=Pet.DOG;
	}
}
enum Pet{//ö��
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

package week1.day1;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class Car {
	public void applyBreak()
	{
		System.out.println("apply the break");

	}
	public void applyGear()
	{
		System.out.println("apply the gear");
	}

	public void switchonAc()
	{

		System.out.println("switch on the AC");	
	}
	public void applyAccelerator()
	{
		System.out.println("apply the accelerator");
	}

	public static void main(String[] args) {

MyCarAutomatic my = new MyCarAutomatic();
my.MyCarMethod();
my.MyCarSpeciality();

System.out.println("__________________________");

MyCarManual mym = new MyCarManual();
mym.MyCarMethod();
mym.MyCarSpeciality();

		
	}
}
  class MyCarAutomatic
	{	
	public void MyCarMethod()
	{
		Car caa2=new Car();
		
		caa2.applyBreak();
		
		caa2.applyGear();
		caa2.switchonAc();
		caa2.applyAccelerator();
		
	}
	public void MyCarSpeciality()
	{
		System.out.println("This is automatic");
		
	}
	
   }
  
  
  class MyCarManual
	{	
	public void MyCarMethod()
	{
		Car caa2=new Car();
		
		caa2.applyBreak();
		
		caa2.applyGear();
		caa2.switchonAc();
		caa2.applyAccelerator();
		
	}
	public void MyCarSpeciality()
	{
		System.out.println("This is Manual");
		
	}
	
 }
  






// TODO Auto-generated method stub





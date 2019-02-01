package com.bdg.vkaramyan.inheritence;

public class Animal1 {
	void eat(){System.out.println("eating...");}  
	}  
	class Doggy extends Animal{  
	void bark(){System.out.println("barking...");}  
	}  
	class BabyDog extends Doggy{  
	void weep(){System.out.println("weeping...");}  
	}  
	class TestInheritance2{  
	public static void main(String args[]){  
	BabyDog d=new BabyDog();  
	d.weep();  
	d.bark();  
	d.eat();  
	}

}

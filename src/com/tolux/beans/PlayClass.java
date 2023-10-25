package com.tolux.beans;


class Play
{
	PlayClass play[]=new PlayClass[3];
	
	public void displayName() {
		play[0]= new PlayClass("Tolu","36");
		play[1]=new PlayClass("James","36");
		play[2]=new PlayClass("James","39");
		play[3]=new PlayClass("August","39");
		
		for(PlayClass elem:play) {
			System.out.println(elem.getName()+" "+elem.getAge());
		}
	}

}

public class PlayClass {
	
	private String name;
	
	private String age;

	public PlayClass(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
		
}

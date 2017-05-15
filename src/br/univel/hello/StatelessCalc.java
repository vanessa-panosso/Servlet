package br.univel.hello;

import javax.ejb.Stateless;

@Stateless
public class StatelessCalc {

	public StatelessCalc() {
		System.out.println("------------------------");
		System.out.println("		Nasceu!!!!!!!!!!");
		System.out.println("------------------------");

	}
	
	public int soma(int a, int b) {
		return a+b;
	}
	
}

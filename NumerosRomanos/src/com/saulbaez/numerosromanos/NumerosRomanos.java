package com.saulbaez.numerosromanos;

import javax.swing.JOptionPane;

public class NumerosRomanos {
	
	public static void main (String[] args){
		
		
		int unidades, decenas, centenas, millares;
		String uni = "", dec = "", cen = "", mil = "";
		/*
		String uni = "";
    	String dec = "";
    	String cen = "";
    	String mil = "";*/
		
		JOptionPane.showMessageDialog(null, "Programa que convierte un número arábigo a romano"
																+ "\n(1 - 3999)");
		String numero = JOptionPane.showInputDialog("Escriba un número "
																+ "\n(1 - 3999)");
		
		int num = Integer.parseInt(numero);
		
		unidades = num%10;
		decenas = (num/10)%10;
		centenas = (num/100)%10;
	    millares = (num/1000)%10;
	    
	    if(num > 0 && num < 4000){
		if(unidades >= 0 && unidades < 10){
			
			switch(unidades){
			
			case 0:
				uni ="";
				break;
			
			case 1:
				uni = "I";
				break;
				
			case 2:
				uni = "II";
				break;
				
			case 3:
				uni = "III";
				break;
				
			case 4:
				uni = "IV";
				break;
				
			case 5:
				uni = "V";
				break;
				
			case 6:
				uni = "VI";
				break;
				
			case 7:
				uni = "VII";
				break;
				
			case 8:
				uni = "VIII";
				break;
				
			case 9:
				uni = "IX";
				break;					
			}		
		}
		
		if(decenas >= 0 && decenas < 10){
			
			switch(decenas){
			
			case 0:
				dec ="";
				break;
			
			case 1:
				dec = "X";
				break;
				
			case 2:
				dec = "XX";
				break;
				
			case 3:
				dec = "XXX";
				break;
				
			case 4:
				dec = "XL";
				break;
				
			case 5:
				dec = "L";
				break;
				
			case 6:
				dec = "LX";
				break;
				
			case 7:
				dec = "LXX";
				break;
				
			case 8:
				dec = "LXXX";
				break;
				
			case 9:
				dec = "XC";
				break;					
			}
		}
		
		if(centenas >= 0 && centenas < 10){
			
			switch(centenas){
			
			case 0:
				cen ="";
				break;
			
			case 1:
				cen = "C";
				break;
				
			case 2:
				cen = "CC";
				break;
				
			case 3:
				cen = "CCC";
				break;
				
			case 4:
				cen = "CD";
				break;
				
			case 5:
				cen = "D";
				break;
				
			case 6:
				cen = "DC";
				break;
				
			case 7:
				cen = "DCC";
				break;
				
			case 8:
				cen = "DCCC";
				break;
				
			case 9:
				cen = "CM";
				break;
				
				
			}
		}
		
		if(millares >= 0 && millares < 4){
			
			switch(millares){
			
			case 0:
				mil ="";
				break;
			
			case 1:
				mil = "M";
				break;
				
			case 2:
				mil = "MM";
				break;
				
			case 3:
				mil = "MMM";
				break;				
			}
			
			JOptionPane.showMessageDialog(null, "El número romano es: " + mil + cen + dec + uni);
			
		}
	}
	    
	    else{
	    	JOptionPane.showMessageDialog(null, "Número inválido");
	    }
	    
	}
}

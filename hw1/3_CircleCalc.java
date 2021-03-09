package com.site;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class CircleCalc {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("***Circle calculator***");
		System.out.println();
		System.out.println("Input radius of a circle (m):");
		
		int radius = Integer.parseInt(br.readLine());
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Perimeter of a circle: " + "\t" + df.format((2 * Math.PI * radius)) + " m");
		System.out.println("Area of a circle: " + "\t" + df.format((Math.PI * Math.pow(radius, 2))) + " m");
		
		
		

	}

}

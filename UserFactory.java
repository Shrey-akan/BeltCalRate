package com.beltrate;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class UserFactory {

	public static void main(String[] args) throws IOException {
		GetRate nn = new GetRate();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Section of Belt");
		String section = br.readLine();
		System.out.println("Enter Size");
		int size = Integer.parseInt(br.readLine());
		System.out.println("Enter quantity");
		int qnty  = Integer.parseInt(br.readLine());
		Belt bb = nn.getPlan(section);
		bb.getrate();
		bb.calAmount(size, qnty);

	}

}

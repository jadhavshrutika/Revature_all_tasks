package task1;

import java.util.Scanner;

public class DomainNameExtractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("Please Enter utl :");
				String str=sc.nextLine();
				domainExtracter(str);
			}

			public static void domainExtracter(String str) {
				String str2[]=str.split("/");
				System.out.println("Domain Name : "+ str2[2]);
				}
	

}

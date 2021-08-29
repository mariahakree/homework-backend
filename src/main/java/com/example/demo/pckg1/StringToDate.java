//package com.example.demo.pckg1;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.springframework.data.mongodb.core.mapping.Field;
//
//public class StringToDate {
//	@Field
//	int month;
//	@Field
//	int day;
//	@Field
//	int year;
//
//	
//	public Date convert(String string)
//	{
//		Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(string);
//		return date1;
//
//	}
////	public static Date main(String args)throws Exception {
////		//String sDate1="31/12/1998";
////		Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(args);
////		return date1;
////		//System.out.println(args+"\t"+date1);
////	}
//
//}

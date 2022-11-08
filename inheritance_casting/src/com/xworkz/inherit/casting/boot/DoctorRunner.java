package com.xworkz.inherit.casting.boot;

import com.xworkz.inherit.casting.code.Doctor;
import com.xworkz.inherit.casting.coding.Cardiologist;
import com.xworkz.inherit.casting.coding.Dentist;
import com.xworkz.inherit.casting.coding.Ent;

public class DoctorRunner {

	public static void main(String[] args) 
	{
		Doctor doctor=new Doctor();
	
		System.out.println(doctor.hospitalName);
		System.out.println(doctor.name);
		
		Doctor doctor1=new Dentist();
		
		Dentist dentist=(Dentist)doctor1;
		dentist.totalNoOfDentists=5;
		dentist.type="Gums Specilaist";
		System.out.println(dentist.hospitalName);
		System.out.println(dentist.name);
		System.out.println(dentist.totalNoOfDentists);
		System.out.println(dentist.type);
		
		
		Doctor doctor2=new Cardiologist();
		Cardiologist cardiologist=(Cardiologist)doctor2;
		cardiologist.education="M.S in cardiology";
		cardiologist.salaryOfCardiologist=454322;
		System.out.println(cardiologist.education);
		System.out.println(cardiologist.salaryOfCardiologist);
		System.out.println(cardiologist.name);
		System.out.println(cardiologist.hospitalName);
		
		Doctor doctor3=new Ent();
		Ent ent=(Ent)doctor3;
		ent.doctorName="jyothi";
		ent.age=25;
		 System.out.println(ent.name);
		 System.out.println(ent.hospitalName);
		 System.out.println(ent.age);
		 System.out.println(ent.doctorName);
		
		
				
		
	
	} 

}

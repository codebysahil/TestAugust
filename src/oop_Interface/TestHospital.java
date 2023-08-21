package oop_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		Fortis fh = new Fortis();
		fh.cardioService();
		fh.emergencyServices();
		fh.medicalInsurance();
		fh.medicalTraining();
		fh.medicalResearch();
		System.out.println("------------------------------");
		USMedical.billing();
		
		USMedical us = new Fortis();
		us.cardioService();
		us.neuroServices();
		us.physioServices();
		us.emergencyServices();
		
		UKMedical uk = new Fortis();
		uk.dentalServices();
		uk.emergencyServices();
		uk.entServices();
		
		IndiaMedical im = new Fortis();
		im.pediaServices();
		im.emergencyServices();
		im.oncoServices();
		
		// down casting at the compile time
		// not possible as we can't create the object of the interface
		// so it's an error at the compile time
		
				
	    

	}

}

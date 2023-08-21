package oop_Interface;

public class Fortis extends Medical implements USMedical,UKMedical,IndiaMedical {

	@Override
	public void cardioService() {
		System.out.println("Fortis-- cardioservices");
		
	}

	@Override
	public void neuroServices() {
		System.out.println("Fortis-- neuroServices");
		
	}

	@Override
	public void physioServices() {
		System.out.println("Fortis-- physioServices");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("Fortis-- dentalServices");		
	}

	@Override
	public void entServices() {
		System.out.println("Fortis-- entServices");	
		
	}

	@Override
	public void pediaServices() {
		System.out.println("Fortis-- pediaServices");	
		
	}

	@Override
	public void oncoServices() {
		System.out.println("Fortis-- oncoServices");	
		
	}

	@Override
	public void emergencyServices() {
		System.out.println("Fortis-- emergency services");	
		
	}
	
	public void medicalTraining()
	{
		System.out.println("fortis--selfimplemeted medical training");
	}
	public void medicalInsurance()
	{
		System.out.println("fortis--selfimplemeted  medicalInsurance");
	}

	
}

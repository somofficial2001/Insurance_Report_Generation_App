package in.ashokit.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.CitizenPlan;
import in.ashokit.repo.CitizenPlanRepository;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	private CitizenPlanRepository repo;

	
	public void run(ApplicationArguments args) throws Exception {

		repo.deleteAll();
		
		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("john");
		c1.setGender("male");
		c1.setPlanName("cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenefitAmount(5000.00);

		// cash plan data
		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("ashish");
		c2.setGender("female");
		c2.setPlanName("cash");
		c2.setPlanStatus("denied");
		c2.setDenielReason("Rental income");

		// cash plan data
		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("bishwajit");
		c3.setGender("male");
		c3.setPlanName("cash");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.now().minusMonths(4));
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setBenefitAmount(5000.00);
		c3.setTerminateDate(LocalDate.now());
		c3.setTerminateReason("Employed");

		// cash plan data
		CitizenPlan c4 = new CitizenPlan();
		c4.setCitizenName("somnath");
		c4.setGender("male");
		c4.setPlanName("cash");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBenefitAmount(9000.00);

		// cash plan data
		CitizenPlan c5 = new CitizenPlan();
		c5.setCitizenName("Bikash");
		c5.setGender("male");
		c5.setPlanName("cash");
		c5.setPlanStatus("Approved");
		c5.setPlanStartDate(LocalDate.now());
		c5.setPlanEndDate(LocalDate.now().plusMonths(6));
		c5.setBenefitAmount(9400.00);

		// cash plan data
		CitizenPlan c6 = new CitizenPlan();
		c6.setCitizenName("Mayuri");
		c6.setGender("female");
		c6.setPlanName("cash");
		c6.setPlanStatus("denied");
		c6.setDenielReason("Rental income");

		// food plan data
		CitizenPlan c7 = new CitizenPlan();
		c7.setCitizenName("Ritesh");
		c7.setGender("male");
		c7.setPlanName("food");
		c7.setPlanStatus("Terminated");
		c7.setPlanStartDate(LocalDate.now().minusMonths(4));
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setBenefitAmount(3900.00);
		c7.setTerminateDate(LocalDate.now());
		c7.setTerminateReason("Employed");

		// food plan data
		CitizenPlan c8 = new CitizenPlan();
		c8.setCitizenName("Sunita");
		c8.setGender("female");
		c8.setPlanName("food");
		c8.setPlanStatus("Approved");
		c8.setPlanStartDate(LocalDate.now());
		c8.setPlanEndDate(LocalDate.now().plusMonths(6));
		c8.setBenefitAmount(6800.00);

		// food plan data
		CitizenPlan c9 = new CitizenPlan();
		c9.setCitizenName("Smruti");
		c9.setGender("male");
		c9.setPlanName("food");
		c9.setPlanStatus("Approved");
		c9.setPlanStartDate(LocalDate.now());
		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
		c9.setBenefitAmount(7500.00);

		// food plan data
		CitizenPlan c10 = new CitizenPlan();
		c10.setCitizenName("Puja");
		c10.setGender("female");
		c10.setPlanName("food");
		c10.setPlanStatus("denied");
		c10.setDenielReason("Rental income");

		// food plan data
		CitizenPlan c11 = new CitizenPlan();
		c11.setCitizenName("Manas");
		c11.setGender("male");
		c11.setPlanName("food");
		c11.setPlanStatus("Terminated");
		c11.setPlanStartDate(LocalDate.now().minusMonths(4));
		c11.setPlanEndDate(LocalDate.now().plusMonths(6));
		c11.setBenefitAmount(8700.00);
		c11.setTerminateDate(LocalDate.now());
		c11.setTerminateReason("Employed");

		// food plan data
		CitizenPlan c12 = new CitizenPlan();
		c12.setCitizenName("Abhijeet");
		c12.setGender("male");
		c12.setPlanName("food");
		c12.setPlanStatus("Approved");
		c12.setPlanStartDate(LocalDate.now());
		c12.setPlanEndDate(LocalDate.now().plusMonths(6));
		c12.setBenefitAmount(6700.00);

		// Medical plan data
		CitizenPlan c13 = new CitizenPlan();
		c13.setCitizenName("Ganesh");
		c13.setGender("male");
		c13.setPlanName("Medical");
		c13.setPlanStatus("Approved");
		c13.setPlanStartDate(LocalDate.now());
		c13.setPlanEndDate(LocalDate.now().plusMonths(6));
		c13.setBenefitAmount(5900.00);

		// Medical plan data
		CitizenPlan c14 = new CitizenPlan();
		c14.setCitizenName("Tanuja");
		c14.setGender("female");
		c14.setPlanName("Medical");
		c14.setPlanStatus("denied");
		c14.setDenielReason("Rental income");

		// Medical plan data
		CitizenPlan c15 = new CitizenPlan();
		c15.setCitizenName("Baresh");
		c15.setGender("male");
		c15.setPlanName("Medical");
		c15.setPlanStatus("Terminated");
		c15.setPlanStartDate(LocalDate.now().minusMonths(4));
		c15.setPlanEndDate(LocalDate.now().plusMonths(6));
		c15.setBenefitAmount(7800.00);
		c15.setTerminateDate(LocalDate.now());
		c15.setTerminateReason("Employed");

		// Medical plan data
		CitizenPlan c16 = new CitizenPlan();
		c16.setCitizenName("Nadim");
		c16.setGender("male");
		c16.setPlanName("Medical");
		c16.setPlanStatus("Approved");
		c16.setPlanStartDate(LocalDate.now());
		c16.setPlanEndDate(LocalDate.now().plusMonths(6));
		c16.setBenefitAmount(4400.00);

		// Medical plan data
		CitizenPlan c17 = new CitizenPlan();
		c17.setCitizenName("Rakesh");
		c17.setGender("male");
		c17.setPlanName("Medical");
		c17.setPlanStatus("Approved");
		c17.setPlanStartDate(LocalDate.now());
		c17.setPlanEndDate(LocalDate.now().plusMonths(6));
		c17.setBenefitAmount(5500.00);

		// Medical plan data
		CitizenPlan c18 = new CitizenPlan();
		c18.setCitizenName("Suhani");
		c18.setGender("female");
		c18.setPlanName("Medical");
		c18.setPlanStatus("denied");
		c18.setDenielReason("Rental income");

		// Employement plan data
		CitizenPlan c19 = new CitizenPlan();
		c19.setCitizenName("Atul");
		c19.setGender("male");
		c19.setPlanName("Employement");
		c19.setPlanStatus("Terminated");
		c19.setPlanStartDate(LocalDate.now().minusMonths(4));
		c19.setPlanEndDate(LocalDate.now().plusMonths(6));
		c19.setBenefitAmount(7600.00);
		c19.setTerminateDate(LocalDate.now());
		c19.setTerminateReason("Employed");

		// Employement plan data
		CitizenPlan c20 = new CitizenPlan();
		c20.setCitizenName("sushant");
		c20.setGender("male");
		c20.setPlanName("Employement");
		c20.setPlanStatus("Approved");
		c20.setPlanStartDate(LocalDate.now());
		c20.setPlanEndDate(LocalDate.now().plusMonths(6));
		c20.setBenefitAmount(4500.00);

		// Employement plan data
		CitizenPlan c21 = new CitizenPlan();
		c21.setCitizenName("milan");
		c21.setGender("male");
		c21.setPlanName("Employement");
		c21.setPlanStatus("Approved");
		c21.setPlanStartDate(LocalDate.now());
		c21.setPlanEndDate(LocalDate.now().plusMonths(6));
		c21.setBenefitAmount(6500.00);

		// Employement plan data
		CitizenPlan c22 = new CitizenPlan();
		c22.setCitizenName("bulky");
		c22.setGender("male");
		c22.setPlanName("Employement");
		c22.setPlanStatus("Approved");
		c22.setPlanStartDate(LocalDate.now());
		c22.setPlanEndDate(LocalDate.now().plusMonths(6));
		c22.setBenefitAmount(8000.00);

		// Employement plan data
		CitizenPlan c23 = new CitizenPlan();
		c23.setCitizenName("Rajashree");
		c23.setGender("female");
		c23.setPlanName("Employement");
		c23.setPlanStatus("denied");
		c23.setDenielReason("Rental income");

		// Employement plan data
		CitizenPlan c24 = new CitizenPlan();
		c24.setCitizenName("ranjit");
		c24.setGender("male");
		c24.setPlanName("Employement");
		c24.setPlanStatus("Terminated");
		c24.setPlanStartDate(LocalDate.now().minusMonths(4));
		c24.setPlanEndDate(LocalDate.now().plusMonths(6));
		c24.setBenefitAmount(6000.00);
		c24.setTerminateDate(LocalDate.now());
		c24.setTerminateReason("govt Employed");

		List<CitizenPlan> list = repo.saveAll(Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24));
         
		repo.saveAll(list);
	}
}

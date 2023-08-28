package in.ashokit.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.filters.ExpiresFilter.XHttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.entity.CitizenPlan;
import in.ashokit.request.SearchRequest;
import in.ashokit.service.ReportService;

@Controller
public class ReportController {

	@Autowired
	private ReportService service;
	
	@GetMapping("/pdf")
	public void pdfExport(HttpServletResponse response) throws Exception {
		
		response.setContentType("application/pdf");
		
		response.addHeader("Content-Disposition", "attachment;filename=plans.pdf");
		
		service.pdfGenerator(response);		
	}
	
	@GetMapping("/excel")
	public void excelExport(HttpServletResponse response) throws Exception {
		
		response.setContentType("application/octet-stream");
		
		response.addHeader("Content-Disposition", "attachment;filename=plans.xls");
		
		service.excelGenerator(response);
		
	}
	
	@PostMapping("/search")
	public String handleSearch(@ModelAttribute("search") SearchRequest request,Model model) {
		
		//System.out.println(request);
		List<CitizenPlan> plans = service.search(request);
		model.addAttribute("plans" , plans);
		
		init(model);
		
		return "index";
		
	}
	/**
	 * This method is used to loAD index page
	 * @param model
	 * @return String
	 */

	@GetMapping("/")
	public String indexPage(Model model) {

		model.addAttribute("search", new SearchRequest());
		init(model);
		return "index";
	}

	private void init(Model model) {
		model.addAttribute("names", service.getPlanNames());
		model.addAttribute("status", service.getPlanStatus());
	}

}

package in.ashokit.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import in.ashokit.entity.CitizenPlan;
import in.ashokit.request.SearchRequest;

@Service
public interface ReportService {

	public List<String> getPlanNames();

	public List<String> getPlanStatus();

	public List<CitizenPlan> search(SearchRequest request);

	public boolean pdfGenerator(HttpServletResponse response) throws Exception;

	public boolean excelGenerator(HttpServletResponse response) throws Exception;
 
}

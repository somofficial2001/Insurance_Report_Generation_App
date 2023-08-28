package in.ashokit.request;

import lombok.Data;

@Data
public class SearchRequest {
	
	private String planName;
	private String planStatus;
	private String gender;
	private String startDate; //yyyy-mm-dd
	private String endDate;   //yyyy-mm-dd
	
}

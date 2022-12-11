package com.ashokit.response;
import javax.xml.bind.annotation.XmlRootElement;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement
public class Student {
	
	@JsonProperty("student_id")
	private Integer studentId;
	
	@JsonProperty("student_name")
	private String studentName;
	
	@JsonProperty("student_skill")
	private String studentSkill;
}

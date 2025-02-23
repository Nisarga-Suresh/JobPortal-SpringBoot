package com.jsp.job_portal.dto;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String company;
    private String position;
    private LocalDate expStartDate;
    private LocalDate expEndDate;
    private String jobDescription;
	@Override
	public String toString() {
		return "Experience [id=" + id + ", company=" + company + ", position=" + position + ", expStartDate="
				+ expStartDate + ", expEndDate=" + expEndDate + ", jobDescription=" + jobDescription + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public LocalDate getExpStartDate() {
		return expStartDate;
	}
	public void setExpStartDate(LocalDate expStartDate) {
		this.expStartDate = expStartDate;
	}
	public LocalDate getExpEndDate() {
		return expEndDate;
	}
	public void setExpEndDate(LocalDate expEndDate) {
		this.expEndDate = expEndDate;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
    
    

}

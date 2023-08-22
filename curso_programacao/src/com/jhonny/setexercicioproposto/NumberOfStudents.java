package com.jhonny.setexercicioproposto;

import java.util.Objects;

public class NumberOfStudents {
	
	private Integer numberodstudents;
	private Integer student;
	public NumberOfStudents(Integer numberodstudents, Integer student) {
		this.numberodstudents = numberodstudents;
		this.student = student;
	}
	public Integer getNumberodstudents() {
		return numberodstudents;
	}
	public void setNumberodstudents(Integer numberodstudents) {
		this.numberodstudents = numberodstudents;
	}
	public Integer getStudent() {
		return student;
	}
	public void setStudent(Integer student) {
		this.student = student;
	}
	@Override
	public int hashCode() {
		return Objects.hash(student);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NumberOfStudents other = (NumberOfStudents) obj;
		return Objects.equals(student, other.student);
	}
	
	
	
	
}

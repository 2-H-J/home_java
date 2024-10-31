package dto;

import java.util.Objects;

public class Employee {
	
	String empNo; // 사번
	String empName; // 사원명
	String posn; // 직급
	String deptName; // 부서
	int sal; // 급여
	
	public Employee(String empNo, String empName, String posn, String deptName, int sal) {
		this.empNo = empNo;
		this.empName = empName;
		this.posn = posn;
		this.deptName = deptName;
		this.sal = sal;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPosn() {
		return posn;
	}

	public void setPosn(String posn) {
		this.posn = posn;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return " [ 사원번호 : " + empNo + " / 이름 : " + empName + " / 직급 : " + posn + " / 부서 : " + deptName
				+ " / 연봉 : " + sal + " ]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empNo, other.empNo);
	}
	
	
	
}

package collection;


public class Trainer 
{
	private int tid;
	private String tname;
	private double salary;
	
	public Trainer(int tid, String tname, double salary)
	{
		this.tid=tid;
		this.tname=tname;
		this.salary=salary;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString()
	{
		return "Tid="+tid+"Tname="+tname+"Salary="+salary;
	}
}
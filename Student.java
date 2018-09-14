class Student{
	private String Name;
	private String Id;
	private String Group;
	private String Email;

	Student(){
		Name="Student";
		Id="000";
		Group="K59CB";
		Email="uet@vnu.edu.vn";
	}
	Student(String n, String sid,String gr, String em){
		Name=n;
		Id=sid;
		Group=gr;
		Email=em;
	}

	Student(Student s){
		Name=s.Name;
		Id=s.Id;
		Group=s.Group;
		Email=s.Email;
	}

	public void setName(String name){
		Name=name;
	}
	public String getName(){
		return Name;
	}
	public void setId(String id){
		Id=id;
	}
	public String getId(){
		return Id;
	}
	public void setGroup(String group){
		Group=group;
	}
	public String getGroup(){
		return Group;
	}
	public void setEmail(String email){
		Email=email;
	}
	public String getEmail(){
		return Email;
	}

	public void getInfo(){
		System.out.println("NAME : "+Name);
		System.out.println("ID : "+Id);
		System.out.println("GROUP : "+Group);
		System.out.println("EMAIL : "+Email);
	}
}
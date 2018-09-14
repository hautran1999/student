import java.util.Scanner;

public class StudentManagement{
	public static void main(String[] args) {
		Student myinfo=new Student();

		myinfo.setName("Tran Trung Hau");
		myinfo.setId("17020727");
		myinfo.setGroup("K62IE1");
		myinfo.setEmail("hautran1999@gmail.com");
		myinfo.getInfo();

		Student sv1 = new Student();
		sv1.getInfo();
		Student sv2 = new Student("name","001","K62IE2","uet@gmail.com");
		sv2.getInfo();
		Student sv3 = new Student(myinfo);
		sv3.getInfo();

		System.out.println(sameGroup(sv1,sv2));

		Scanner scan = new Scanner(System.in);
		System.out.println("input number student : ");
		int n = scan.nextInt();

		Student[] sv = new Student[n];

		inputListClass(sv,n);
		outputListClass(sv,n);


	}
	public static void inputListClass(Student[] sv, int n){
		Scanner scan = new Scanner(System.in);

		for(int i = 0 ; i < n ; i++){
			System.out.println("input name : ");
			String name = scan.nextLine();
			System.out.println("input id : ");
			String id = scan.nextLine();
			System.out.println("input group : ");
			String group = scan.nextLine();
			System.out.println("input email : ");
			String email = scan.nextLine();

			sv[i] = new Student(name,id,group,email);
		}
	}

	public static void outputListClass(Student[] sv, int n){
		for(int i = 0 ; i < n ; i++){
			sv[i].getInfo();
		}
	}

	// public static void studentsByGroup(Student[] sv, int n){
	// 	String[] listClass = new String[n];
	// 	int m = n;
	// 	for (int i = 0 ; i < n ; i++ ){
	// 		listClass[i]=sv[i].getGroup();
	// 	}
	// 	for (int i = 0; i < m-1; i++){
	// 		for (int j = i+1; j < m; j++){
	// 			if (listClass[i]==listClass[j]){
	// 				for (int k = j; k < m-1; k++)
	// 					listClass[k] = listClass[k + 1];
	// 				m--;
	// 				j--;
	// 			}
	// 		}
	// 	}
	// 	for (int i = 0; i < m ; i++ ){
	// 		System.out.println(listClass[i]);
	// 		for(int j = 0 ; j < n ; j++){
	// 			if(sv[j].getGroup()==listClass[i]){


	// 				sv[j].getInfo();
	// 			}
	// 		}
	// 	}
	// }
	public static void studentsByGroup(Student[] sv, int n, String group){
		for(int i = 0 ;i < n ;i++){
			if(sv[i].getGroup()==group){
				sv[i].getInfo();
			}
		}
	}
	public static int removeStudent(Student[] sv , int n, String id){
		for(int i = 0 ; i < n ; i++ ){
			if(sv[i].getId()==id){
				if(i<n-1){
					for(int j = i ; j < n ; j++ ){
						sv[j]=sv[j+1];
					}
					n--;
				}
				else n--;
			}
		}
		return n;
	}
	public static boolean sameGroup(Student s1, Student s2){
		if(s1.getGroup()==s2.getGroup()) return true;
		else return false;
	}


}
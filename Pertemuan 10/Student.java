class Student{
	int NIM;
	String name;
	static String college ="Unsyiah";

	static void change(){
		college = "USK";
	}

	Student(int r,String n){
		NIM = r;
		name = n;
	}

	void display (){
		System.out.println(NIM+" "+name+" "+college);
	}

	public static void main(String args[]){
		Student s1 = new Student(111,"Karen");
		Student s2 = new Student(222,"Arya");
		s1.display();
		s2.display();

		Student.change();
		s1.display();
		s2.display();
	}
}

/*
Pogram diatas akan mencetak NIM, Nama dan college atau nama perguruan tinggi.
Pertama ada nama Unsyiah lalu akan diubah menjadi USK, lalu pertama program 
akan mencetak NIM dan Nama mahasiswa tersebut dengan nama perguruan tinggi
Unsyiah setelah itu akan dicetak kembali dengan perubahan pada nama
perguruan tinggi menjadi USK. Outputnya seperti dibawah ini :
111 Karen Unsyiah
222 Arya Unsyiah
111 Karen USK
222 Arya USK
*/
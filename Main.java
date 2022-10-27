////problem1
//import java.util.ArrayList;
//public class Main{
//    public static void main(String[] args) {
//        Student student1 = new Student(1,"Merey","Yeren","Madiqyzy",2003,"Merki","87474748581","IT","1E",1);
//        Student student2 = new Student(2,"Merey","Omarova","Madiqyzy",2005,"Lugovoe","87474748581","Perevodchik","3E",3);
//        Student student3 = new Student(3,"Aru","Kozhakhmetova","Bakhytzhanqyzy",2004,"Taraz","87474748581","Math","3G",3);
//        Student student4 = new Student(4,"Dana","Iliyas","Kuanyshqyzy",2002,"Aisha-Bibi","87474748581","Buhgalteria","2D",2);
//        Student student5 = new Student(5,"Merey","Kalen","Ilyasqyzy",2006,"Taraz","87474748581","Accounting","1A",1);
//        ArrayList<Student> studentArrayList = new ArrayList<>();
//        studentArrayList.add(student1);
//        studentArrayList.add(student2);
//        studentArrayList.add(student3);
//        studentArrayList.add(student4);
//        studentArrayList.add(student5);
//
//        String faculty = "IT";
//        for(Student a:studentArrayList){
//            if(a.getfaculty()==faculty){
//                System.out.println(a);
//            }
//        }
//
//        //списки студентов по каждому факультету и курсу
//        String it = "IT";
//        String perevodchik ="Perevodchik";
//        String math ="Math";
//        String buhgalteria = "Buhgalteria";
//        String accounting ="Accounting";
//
//        String faculty1 = "IT";
//        for(Student a:studentArrayList){
//            if(a.getfaculty()==faculty1){
//                System.out.println("Students IT faculty"+'\n'+ a);
//            }
//        }
//
//        String faculty2 = "Perevodchik";
//        for(Student a:studentArrayList){
//            if(a.getfaculty()==faculty2){
//                System.out.println("Students Perevodchik faculty"+'\n'+ a);
//            }
//        }
//
//        String faculty3 = "Math";
//        for(Student a:studentArrayList){
//            if(a.getfaculty()==faculty3){
//                System.out.println("Students Math faculty"+'\n'+ a);
//
//            }
//        }
//
//
//        String faculty4 = "Buhgalteria";
//        for(Student a:studentArrayList){
//            if(a.getfaculty()==faculty4){
//                System.out.println("Students Buhgalteria faculty"+'\n'+ a);
//            }
//        }
//        String faculty5 = "Accounting";
//        for(Student a:studentArrayList){
//            if(a.getfaculty()==faculty5){
//                System.out.println("Students Accounting faculty"+'\n'+ a);
//            }
//        }
//
//        int year = 2003;
//        for(Student a:studentArrayList){
//            if(a.getdate_of_birth()>year){
//                System.out.println("students born after 2003:\n"+a);
//            }
//        }
//        ArrayList<String> groups = new ArrayList<>();
//        for(Student a:studentArrayList){
//            groups.add(a.getGroup());
//        }
//        System.out.println(groups);
//
//    }
//}
//class Student{
//    int id;
//    String surname;
//    String name;
//    String patronymic;
//    int date_of_birth;
//    String address;
//    String phone_number;
//    String faculty;
//    int course;
//    String group;
//    public Student(int id,String name,String surname,String patronymic,int date_of_birth,String address,String phone_number,String faculty,String group,int course){
//        this.id = id;
//        this.surname = surname;
//        this.name = name;
//        this.patronymic = patronymic;
//        this.date_of_birth = date_of_birth;
//        this.address = address;
//        this.phone_number = phone_number;
//        this.faculty = faculty;
//        this.course = course;
//        this.group = group;
//
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getpatronymic() {
//        return patronymic;
//    }
//
//    public int getdate_of_birth() {
//        return date_of_birth;
//    }
//
//    public String getaddress() {
//        return address;
//    }
//
//    public String getPhone_number() {
//        return phone_number;
//    }
//
//    public String getfaculty() {
//        return faculty;
//    }
//
//    public int getCourse() {
//        return course;
//    }
//
//    public String getGroup() {
//        return group;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setpatronymic(String patronymic) {
//        this.patronymic = patronymic;
//    }
//
//    public void setdate_of_birth(int date_of_birth) {
//        this.date_of_birth = date_of_birth;
//    }
//
//    public void setaddress(String address) {
//        this.address = address;
//    }
//
//    public void setPhone_number(String phone_number) {
//        this.phone_number = phone_number;
//    }
//
//    public void setfaculty(String faculty) {
//        this.faculty = faculty;
//    }
//
//    public void setCourse(int course) {
//        this.course = course;
//    }
//
//    public void setGroup(String group) {
//        this.group = group;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", surname='" + surname +
//                ", name='" + name +
//                ", patronymic='" + patronymic +
//                ", date_of_birth='" + date_of_birth +
//                ", address='" + address +
//                ", phone_number='" + phone_number +
//                ", faculty='" + faculty +
//                ", course=" + course +
//                ", group='" + group +
//                '}';
//    }
//}


////problem2
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class Main {
//    public static void main(String[] args) {
//        Customer customer = new Customer(123,"Yeren","Merey","Madiqyzy","Merki", 3504,121);
//        Customer customer1 = new Customer(345,"Omarova","Merey","Madiqyzy","Lugovoe", (int) 3604,245);
//        Customer customer2 = new Customer(567,"Kozhakhmentova","Aruzhan","Bakhytzhanqyzy","Taraz", 3704,246);
//        Customer customer3 = new Customer(789,"Iliyas","Uldana","Kuanyshqyzy","Aisha-bibi", 3804,247);
//        Customer customer4 = new Customer(213,"Kalen","Merey","Erikqyzy","Taraz", 3904,204);
//        Customer customer5 = new Customer(456,"Zhumashova","Aizhan","Kurmashqyzy","Taldyqorgan", 3905,249);
//        Customer customer6 = new Customer(765,"Rashid","Zhuldyzai","Kuanyshqyzy","Zhanatas", 3906,250);
//        ArrayList<Customer> customersArrayList = new ArrayList<>();
//        customersArrayList.add(customer);
//        customersArrayList.add(customer1);
//        customersArrayList.add(customer2);
//        customersArrayList.add(customer3);
//        customersArrayList.add(customer4);
//        customersArrayList.add(customer5);
//        customersArrayList.add(customer6);
//        Collections.sort(customersArrayList,new SortName());
//        for(Customer s:customersArrayList){
//            System.out.println(s.getName());
//        }
//
//        int first = 3504;
//        int second = 3804;
//        ArrayList<Customer> diapason_customers = new ArrayList<>();
//        for(Customer f:customersArrayList){
//            if(f.getNumber_card()>=first && f.getNumber_card()<=second){
//                diapason_customers.add(f);
//            }
//        }
//        System.out.println("Diapason Customers number card of 3504-3804");
//        for(Customer f:diapason_customers){
//            System.out.println(f);
//        }
//    }
//}
//class Customer{
//    int id;
//    String surname;
//    String name;
//    String lastname;
//    String address;
//    int number_card;
//    int number_bank_check;
//    public Customer(int id, String surname, String name, String lastname, String address, int number_card, int number_bank_check){
//        this.id =id;
//        this.surname =surname;
//        this.name = name;
//        this.lastname =lastname;
//        this.address =address;
//        this.number_card =number_card;
//        this.number_bank_check =number_bank_check;
//
//    }
//
//    @Override
//    public String toString() {
//        return "Customer{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", name='" + name +
//                ", lastname='" + lastname +
//                ", address='" + address +
//                ", number_card=" + number_card +
//                ", number_bank_check=" + number_bank_check +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public int getNumber_card() {
//        return number_card;
//    }
//
//    public void setNumber_card(int number_card) {
//        this.number_card = number_card;
//    }
//
//    public int getNumber_bank_check() {
//        return number_bank_check;
//    }
//
//    public void setNumber_bank_check(int number_bank_check) {
//        this.number_bank_check = number_bank_check;
//    }
//}
//class SortName implements Comparator<Customer>{
//
//    @Override
//    public int compare(Customer first, Customer second) {
//        return first.getName().compareTo(second.getName());
//    }
//}



//problem3
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        Patient patient1 = new Patient(123,"Yeren","Merey","Madiqyzy","Merki", "87474748581",121, "Cherepnoi");
//        Patient patient2 = new Patient(345,"Omarova","Merey","Madiqyzy","Lugovoe",  "87474748581",245,"ateroskleroz");
//        Patient patient3 = new Patient(567,"Kozhakhmentova","Aruzhan","Bakhytzhanqyzy","Taraz", "87474748581",246, "autizm");
//        Patient patient4 = new Patient(789,"Iliyas","Uldana","Kuanyshqyzy","Aisha-bibi", "87474748581",247, "besplodie");
//        Patient patient5 = new Patient(213,"Kalen","Merey","Erikqyzy","Taraz", "87474748581",204, "alcgeimer");
//        Patient patient6 = new Patient(456,"Zhumashova","Aizhan","Kurmashqyzy","Taldyqorgan", "87474748581",249, "ateroskleroz");
//        ArrayList<Patient> patientsArrayList = new ArrayList<>();
//        patientsArrayList.add(patient1);
//        patientsArrayList.add(patient2);
//        patientsArrayList.add(patient3);
//        patientsArrayList.add(patient4);
//        patientsArrayList.add(patient5);
//        patientsArrayList.add(patient6);
//
//        ArrayList<Patient> ateroskleroz = new ArrayList<>();
//        String ateroskleroz_diagn = "ateroskleroz";
//        for(Patient a:patientsArrayList){
//            if(a.getDiagnosis()==ateroskleroz_diagn){
//                ateroskleroz.add(a);
//            }
//        }
//        System.out.println("aterosklerozben auyratyn adamdar:");
//        for(Patient a:ateroskleroz){
//            System.out.println(a);
//        }
//
//        int first = 204;
//        int second = 245;
//        ArrayList<Patient> interval = new ArrayList<>();
//        for(Patient a:patientsArrayList){
//            if(a.getMedical_record_number()>=first && a.getMedical_record_number()<=second){
//                interval.add(a);
//            }
//        }
//        System.out.println();
//        for(Patient a: interval){
//            System.out.println(a);
//        }
//    }
//}
//class Patient{
//    int id;
//    String surname;
//    String name;
//    String patronymic;
//    String address;
//    String phone_number;
//    int medical_record_number;
//    String diagnosis;
//    public Patient(int id,String surname,String name,String patronymic,String address,String phone_number,int medical_record_number,String diagnosis){
//        this.id = id;
//        this.surname = surname;
//        this.name = name;
//        this.patronymic = patronymic;
//        this.address = address;
//        this.phone_number = phone_number;
//        this.medical_record_number = medical_record_number;
//        this.diagnosis = diagnosis;
//    }
//
//    @Override
//    public String toString() {
//        return "Patient{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", name='" + name + '\'' +
//                ", patronymic='" + patronymic + '\'' +
//                ", address='" + address + '\'' +
//                ", phone_number='" + phone_number + '\'' +
//                ", medical_record_number=" + medical_record_number +
//                ", diagnosis='" + diagnosis + '\'' +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPatronymic() {
//        return patronymic;
//    }
//
//    public void setPatronymic(String patronymic) {
//        this.patronymic = patronymic;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getPhone_number() {
//        return phone_number;
//    }
//
//    public void setPhone_number(String phone_number) {
//        this.phone_number = phone_number;
//    }
//
//    public int getMedical_record_number() {
//        return medical_record_number;
//    }
//
//    public void setMedical_record_number(int medical_record_number) {
//        this.medical_record_number = medical_record_number;
//    }
//
//    public String getDiagnosis() {
//        return diagnosis;
//    }
//
//    public void setDiagnosis(String diagnosis) {
//        this.diagnosis = diagnosis;
//    }
//}



//problem4
//import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args) {
//        applicant applicant1 = new applicant(12,"Omarova","Merey","Madiqyzy","Lugovoe","87054121874",85);
//        applicant applicant2 = new applicant(12,"Yeren","Merey","Madiqyzy","Merki","87073270317",55);
//        applicant applicant3 = new applicant(12,"Kozhakhmetova","Aru","Bakhytzhanqyzy","Taraz","87078871243",90);
//        applicant applicant4 = new applicant(12,"Sayakbay","Ulbosyn","Dosmahanqyzy","Merki","87474748581",0);
//        applicant applicant5 = new applicant(12,"Iliyas","Uldana","Kuanyshqyzy","Aisha-Bibi","87474748581",50);
//        applicant applicant6 = new applicant(12,"Kalen","Merey","Madiqyzy","Taraz","87474748581",60);
//
//        ArrayList<applicant> applicantArrayList = new ArrayList<>();
//        applicantArrayList.add(applicant1);
//        applicantArrayList.add(applicant2);
//        applicantArrayList.add(applicant3);
//        applicantArrayList.add(applicant4);
//        applicantArrayList.add(applicant5);
//        applicantArrayList.add(applicant6);
//
//        ArrayList<applicant> unsatisfactory = new ArrayList<>();
//
//        for(applicant a: applicantArrayList){
//            if(a.getMarks()<61){
//                unsatisfactory.add(a);
//            }
//        }
//        System.out.println("unsatisfactory grades:");
//        for (applicant a:unsatisfactory) {
//            System.out.println(a);
//        }
//
//        ArrayList<applicant> higher_score = new ArrayList<>();
//        for(applicant b:applicantArrayList){
//            if(b.getMarks()>75){
//                higher_score.add(b);
//            }
//        }
//        System.out.println("scores are higher than the specified one");
//        for(applicant b:higher_score){
//            System.out.println(b);
//        }
//
//        ArrayList<applicant> highest = new ArrayList<>();
//        System.out.println("highest total score");
//
//        for(applicant c:applicantArrayList){
//            if(c.getMarks()>79){
//                System.out.println(c);
//            }
//        }
//
//    }
//}
//
//class applicant{
//    int id;
//    String surname;
//    String name;
//    String Patronymic;
//    String address;
//    String phone_number;
//    int marks;
//
//    public applicant(int id, String surname, String name, String Patronymic, String address, String phone_number, int marks) {
//        this.id = id;
//        this.surname = surname;
//        this.name = name;
//        this.Patronymic = Patronymic;
//        this.address = address;
//        this.phone_number = phone_number;
//        this.marks = marks;
//    }
//
//    @Override
//    public String toString() {
//        return "applicant{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", name='" + name + '\'' +
//                ", patronymic='" + Patronymic + '\'' +
//                ", address='" + address + '\'' +
//                ", phone_number='" + phone_number + '\'' +
//                ", marks=" + marks +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPatronymic() {
//        return Patronymic;
//    }
//
//    public void setPatronymic(String Patronymic) {
//        this.Patronymic = Patronymic;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getPhone_number() {
//        return phone_number;
//    }
//
//    public void setPhone_number(String phone_number) {
//        this.phone_number = phone_number;
//    }
//
//    public int getMarks() {
//        return marks;
//    }
//
//    public void setMarks(int marks) {
//        this.marks = marks;
//    }
//}


//problem5
//import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args) {
//        Book book1 = new Book(1,"ne bud vtorym","Eric","Seoul",2022,300,"4500","book");
//        Book book2 = new Book(2,"Google","Merey","Astana",2020,245,"4500","book");
//        Book book3 = new Book(3,"Google","Asem","Almaty",2019,300,"4500","book");
//        Book book4 = new Book(4,"Google","Aru","Shumkent",2015,300,"4500","book");
//        Book book5 = new Book(5,"Google","Alina","Taldyqorgan",2017,300,"4500","book");
//        Book book6 = new Book(6,"Google","Dina","Merki",2018,300,"4500","book");
//        ArrayList<Book> bookArrayList = new ArrayList<>();
//        bookArrayList.add(book1);
//        bookArrayList.add(book2);
//        bookArrayList.add(book3);
//        bookArrayList.add(book4);
//        bookArrayList.add(book5);
//        bookArrayList.add(book6);
//
//        String author_google = "Eric";
//        ArrayList<Book> author = new ArrayList<>();
//        for(Book a:bookArrayList){
//            if(a.getAuthor()==author_google){
//                author.add(a);
//            }
//        }
//        System.out.println(author);
//
//
//        String publisher_astana = "Astana";
//      ArrayList<Book> publisher = new ArrayList<>();
//       for(Book a:bookArrayList){
//            if(a.getPublisher()==publisher_astana){
//                publisher.add(a);
//            }
//        }
//        System.out.println(publisher);
//
//
//
//        ArrayList<Book> years = new ArrayList<>();
//        for(Book a:bookArrayList){
//            if(a.getYear()>2018){
//                years.add(a);
//            }
//        }
//        System.out.println(years);
//    }
//}
//class Book{
//    int id;
//    String name;
//    String author;
//    String publisher;
//    int year;
//    int numofpages;
//    String price;
//    String type_of_binding;
//
//    public Book(int id, String name, String author, String publisher, int year, int numofpages, String price, String type_of_binding) {
//        this.id = id;
//        this.name = name;
//        this.author = author;
//        this.publisher = publisher;
//        this.year = year;
//        this.numofpages = numofpages;
//        this.price = price;
//        this.type_of_binding = type_of_binding;
//    }
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", author='" + author + '\'' +
//                ", publisher='" + publisher + '\'' +
//                ", year=" + year +
//                ", numofpages=" + numofpages +
//                ", price='" + price + '\'' +
//                ", type_of_binding='" + type_of_binding + '\'' +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public String getPublisher() {
//        return publisher;
//    }
//
//    public void setPublisher(String publisher) {
//        this.publisher = publisher;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public int getNumofpages() {
//        return numofpages;
//    }
//
//    public void setNumofpages(int numofpages) {
//        this.numofpages = numofpages;
//    }
//
//    public String getPrice() {
//        return price;
//    }
//
//    public void setPrice(String price) {
//        this.price = price;
//    }
//
//    public String getType_of_binding() {
//        return type_of_binding;
//    }
//
//    public void setType_of_binding(String type_of_binding) {
//        this.type_of_binding = type_of_binding;
//    }
//}
//





////Problem7
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class Main{
// public static void main(String[] args) {
// Phone phone1 = new Phone(1,"Omarova","Merey","Madiqyzy","Lugovoe",333,111,1,25);
// Phone phone2 = new Phone(2,"Yeren","Merey","Dosmakhanqyzy","Merke",444,222,5,12);
// Phone phone3 = new Phone(3,"Ilyas","Uldana","Kuanyshkyzy","Aisha-Bibi",333,333,10,4);
//     Phone phone5 = new Phone(4,"Kozhakhmetova","Aruzhan","Bakhtzhankyzy","Taraz",555,444,9,5);
//     Phone phone4 = new Phone(5,"Kalen","Merey","Erikkyzy","Taraz",666,555,4,2);
//     Phone phone6 = new Phone(6,"Tanatar","Alina","Erikinkyzy","Taraz",777,666,3,50);
// ArrayList<Phone> phoneArrayList = new ArrayList<>();
// phoneArrayList.add(phone1);
// phoneArrayList.add(phone2);
// phoneArrayList.add(phone3);
// phoneArrayList.add(phone4);
// phoneArrayList.add(phone5);
// phoneArrayList.add(phone6);
//
//        int time_exceeds = 12;
//        ArrayList<Phone> exceed_time = new ArrayList<>();
//        for(Phone s:phoneArrayList){
//            if(s.getTime()>time_exceeds){
//                exceed_time.add(s);
//            }
//        }
//        System.out.println(exceed_time);

//        ArrayList<Phone> long_distnce = new ArrayList<>();
//        for(Phone a:phoneArrayList){
//            if(a.getDebit()>333){
//                long_distnce.add(a);
//            }
//        }
//        System.out.println(long_distnce);
//
//
//        Collections.sort(phoneArrayList,new SortByName());
//        for(Phone a:phoneArrayList){
//            System.out.println(a.getName());
//        }
//    }
//}
//
//class Phone{
//    int id;
//    String surname;
//    String name;
//    String patronymic;
//    String address;
//    int credit_card_num;
//    int debit;
//    int credit;
//    int time;
//
//    public Phone(int id, String surname, String name, String patronymic, String address, int credit_card_num, int debit, int credit, int time) {
//        this.id = id;
//        this.surname = surname;
//        this.name = name;
//        this.patronymic = patronymic;
//        this.address = address;
//        this.credit_card_num = credit_card_num;
//        this.debit = debit;
//        this.credit = credit;
//        this.time = time;
//    }
//
//    @Override
//    public String toString() {
//        return "Phone{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", name='" + name + '\'' +
//                ", patronymic='" + patronymic + '\'' +
//                ", address='" + address + '\'' +
//                ", credit_card_num=" + credit_card_num +
//                ", debit=" + debit +
//                ", credit=" + credit +
//                ", time=" + time +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPatronymic() {
//        return patronymic;
//    }
//
//    public void setPatronymic(String patronymic) {
//        this.patronymic = patronymic;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public int getCredit_card_num() {
//        return credit_card_num;
//    }
//
//    public void setCredit_card_num(int credit_card_num) {
//        this.credit_card_num = credit_card_num;
//    }
//
//    public int getDebit() {
//        return debit;
//    }
//
//    public void setDebit(int debit) {
//        this.debit = debit;
//    }
//
//    public int getCredit() {
//        return credit;
//    }
//
//    public void setCredit(int credit) {
//        this.credit = credit;
//    }
//
//    public int getTime() {
//        return time;
//    }
//
//    public void setTime(int time) {
//        this.time = time;
//    }
//}
//class SortByName implements Comparator<Phone> {
//
//    @Override
//    public int compare(Phone first, Phone second) {
//        return first.getName().compareTo(second.getName());
//    }
//}



//problem8
//import java.util.ArrayList;
//public class Main {
//    public static void main(String [] args){
//        ArrayList<Car> carArrayList = new ArrayList<>();
//        Car car1 = new Car(1, "Tesla", "70", 2000, "white", 150, "1234");
//        Car car2 = new Car(2, "BMW", "70", 2001, "black", 2500, "12345");
//        Car car3 = new Car(3, "Toyoto", "70", 2020, "green", 350, "12346");
//        Car car4 = new Car(4, "Matiz", "70", 2015, "yellow", 450, "12347");
//        Car car5 = new Car(5, "Mersedes", "70", 2002, "red", 1000, "12348");
//
//        carArrayList.add(car1);
//        carArrayList.add(car2);
//        carArrayList.add(car3);
//        carArrayList.add(car4);
//        carArrayList.add(car5);
//
//        for (Car a: carArrayList){
//            if (a.brand.equals("Matiz")){
//                System.out.println(a);
//            }
//        }
//
//        for (Car s : carArrayList){
//            if (s.brand.equals("Toyoto") && s.yearissue < 2022){
//                System.out.println(s);
//            }
//        }
//
//        for (Car s : carArrayList){
//            if (s.yearissue == 2002 && s.price > 900){
//                System.out.println(s);
//            }
//        }
//    }
//}
//
//class Car{
//    int id;
//    String brand;
//    String model;
//    int yearissue;
//    String color;
//    int price;
//    String registrationNum;
//
//    public Car(int id, String brand, String model, int yearissue, String color, int price, String registrationNum){
//        this.id = id;
//        this.brand = brand;
//        this.model = model;
//        this.yearissue = yearissue;
//        this.color = color;
//        this.price = price;
//        this.registrationNum = registrationNum;
//    }
//
//    @Override
//    public String toString() {
//        return "Car{" +
//                "id=" + id +
//                ", brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", yearissue=" + yearissue +
//                ", color='" + color + '\'' +
//                ", price=" + price +
//                ", registrationNum='" + registrationNum + '\'' +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getbrand() {
//        return brand;
//    }
//
//    public void setbrand(String stamp) {
//        this.brand = stamp;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public int getyearissue() {
//        return yearissue;
//    }
//
//    public void setyearissue(int yearissue) {
//        this.yearissue = yearissue;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public String getRegistrationNum() {
//        return registrationNum;
//    }
//
//    public void setRegistrationNum(String registrationNum) {
//        this.registrationNum = registrationNum;
//    }
//}





//problem9
//import java.util.ArrayList;

//public class Main{
// public static void main(String[] args) {
// Product product1 = new Product(1,"Matiz","1234 ","KZ",1500,11,33);
// Product product2= new Product(2,"Toyoto","5678","Korea",2500,4,59);
// Product product3 = new Product(3,"Rolls-Royce","8910 ","Moskva",3500,20,40);
// Product product4 = new Product(4,"Audi","1112 ","Vengriya",4500,66,80);
// Product product5 = new Product(5,"chevrolet","1314","Rus",5500,80,100);
// Product product6 = new Product(6,"picanto","1516","Astana",6500,20,44);
// ArrayList<Product> productArrayList = new ArrayList<>();
// productArrayList.add(product1);
// productArrayList.add(product2);
// productArrayList.add(product3);
// productArrayList.add(product4);
// productArrayList.add(product5);
// productArrayList.add(product6);
//
//
//
// String list_goods = "picanto";
// ArrayList<Product> names = new ArrayList<>();
// for(Product s:productArrayList){
// if(s.getName()==list_goods){
// names.add(s);
//            }
//        }
// System.out.println(names);
//
// String lists_good = "Audi";
// int prices_good = 4500;
// ArrayList<Product> name = new ArrayList<>();
// for(Product s:productArrayList){
// if(s.getName()==list_goods && s.getPrice()<2500){
// names.add(s);
//            }
//        }
// System.out.println(names);
//
// int shelfs_life = 20;
// ArrayList<Product> id = new ArrayList<>();
// for(Product s:productArrayList){
// if(s.shelflife>shelfs_life){
// names.add(s);
//            }
//        }
// System.out.println(names);
//    }
//}
//
//class Product{
//    int id;
//    String name;
//    String UPC;
//    String manufacturer;
//    int price;
//    int shelflife;
//    int quantity;
//
//    public Product(int id, String name, String UPC, String manufacturer, int price, int shelflife, int quantity) {
//        this.id = id;
//        this.name = name;
//        this.UPC = UPC;
//        this.manufacturer = manufacturer;
//        this.price = price;
//        this.shelflife = shelflife;
//        this.quantity = quantity;
//    }
//
//    @Override
//    public String toString() {
//        return "Product{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", UPC='" + UPC + '\'' +
//                ", manufacturer='" + manufacturer + '\'' +
//                ", price=" + price +
//                ", shelflife=" + shelflife +
//                ", quantity =" + quantity  +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getUPC() {
//        return UPC;
//    }
//
//    public void setUPC(String UPC) {
//        this.UPC = UPC;
//    }
//
//    public String getManufacturer() {
//        return manufacturer;
//    }
//
//    public void setManufacturer(String manufacturer) {
//        this.manufacturer = manufacturer;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public int getShelflife() {
//        return shelflife;
//    }
//
//    public void setShelflife(int shelflife) {
//        this.shelflife = shelflife;
//    }
//
//    public int getQuantity () {
//        return quantity ;
//    }
//
//    public void setQuantity (int quantity ) {
//        this.quantity  = quantity ;
//    }
//}



//problem10
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String [] args){
//        ArrayList<Train> trainsArrayList = new ArrayList<>();
//        Train train1 = new Train("Turkey", 10, "11:20", 100);
//        Train train2 = new Train("Paris", 11, "05:30", 70);
//        Train train3 = new Train("Moskva", 12, "14:43", 70);
//        Train train4 = new Train("Taraz", 35, "7:00", 70);
//        Train train5 = new Train("Kyrgyzstan", 2, "18:45", 80);
//
//        trainsArrayList.add(train1);
//        trainsArrayList.add(train2);
//        trainsArrayList.add(train3);
//        trainsArrayList.add(train4);
//        trainsArrayList.add(train5);
//        for (Train s : trainsArrayList){
//            if (s.destination.equals("Turkey")){
//                System.out.println(s);
//            }
//        }
//        for (Train s : trainsArrayList){
//            if (s.destination.equals("Kyrgyzstan")){
//                if (s.departuretime.equals("18:45")){
//                    System.out.println(s);
//                }
//            }
//        }
//
//        for (Train s : trainsArrayList){
//                if (s.seats == 70){
//                    System.out.println(s);
//
//            }
//        }
//    }
//}
//
//class Train{
//    String destination;
//    int trainnumber;
//    String departuretime;
//    int seats;
//
//    public Train(String destination, int trainnumber, String departuretime, int seats){
//        this.destination = destination;
//        this.trainnumber = trainnumber;
//        this.departuretime = departuretime;
//        this.seats = seats;
//    }
//
//    @Override
//    public String toString() {
//        return "Train{" +
//                "destination='" + destination + '\'' +
//                ", trainnumber=" + trainnumber +
//                ", departuretime='" + departuretime + '\'' +
//                ", quantityOfPlaces=" + seats +
//                '}';
//    }
//
//    public String getDestination() {
//        return destination;
//    }
//
//    public void setDestination(String destination) {
//        this.destination = destination;
//    }
//
//    public int gettrainnumber() {
//        return trainnumber;
//    }
//
//    public void settrainnumber(int trainnumber) {
//        this.trainnumber = trainnumber;
//    }
//
//    public String getdeparturetime() {
//        return departuretime;
//    }
//
//    public void setdeparturetime(String departuretime) {
//        this.departuretime = departuretime;
//    }
//
//    public int getseats() {
//        return seats;
//    }
//
//    public void setseats(int seats) {
//        this.seats = seats;
//    }
//}
package navin.com.java.constructors;

public class Index {

    public static void main(String[] args) {
//        Student st = new Student();
//        st.setName("VIN");
//        st.setAge(23);
        Student st = new Student("NAME",12);
        Book book = new Book();

        System.out.println("Name "+st.getName());
        System.out.println("Age "+st.getAge());
        System.out.println(book.getId());
        System.out.println(book.getTitle());

        book.setTitle("Advanced Java");

        System.out.println(book.toString());

    }

}

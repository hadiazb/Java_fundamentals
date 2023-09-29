public class Doctor {
    public static int id = 0;
    public final static  int PY = 123456;
    public String name;
    public String speciality;

    public Doctor(String name) {
        this.name = name;
        id++;
    }

    /**
     * Description: Print the name in terminal
     * @return: void
     */
    public void showName() {
        System.out.println(this.name);
    }
}

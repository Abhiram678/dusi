public class HelloJenkins {

    public static void main(String[] args) {
        System.out.println("Hello, Jenkins CI/CD Pipeline!");
        System.out.println("This project is pushed to GitHub and built using Jenkins.");

        int result = add(5, 3);
        System.out.println("Addition Result: " + result);

        if(result == 8){
            System.out.println("Build Success ");
        } else {
            System.out.println("Build Failed ");
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }
}

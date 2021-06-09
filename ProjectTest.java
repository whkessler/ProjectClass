public class ProjectTest{
    public static void main(String[] args){

        Project project1 = new Project("Noir");
        System.out.println(project1.elevatorPitch());
        Project project2 = new Project();
        System.out.println(project2.elevatorPitch());
        Project project3 = new Project("Noir","Detective story by Chistopher Moore");
        System.out.println(project3.elevatorPitch());
        Project project4 = new Project("Olympos");
        System.out.println(project4.elevatorPitch());
        Project project5 = new Project("Olympos", "Mythic tale written by Dan Simmons");
        System.out.println(project5.elevatorPitch());
        Project project6 = new Project("The Blade Itself");
        System.out.println(project6.elevatorPitch());
    }
}
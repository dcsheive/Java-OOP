public class ProjectTest {
    public static void main(String[] args) {
        Project project1 = new Project("Applesauce", "Learn how to make applesauce");
        Project project2 = new Project("Applesauce: TWO");
        Project project3 = new Project("Orangesauce?", "Invent orangesauce", 400);
        Portfolio port1 = new Portfolio();
        project1.setCost(300);
        System.out.println(project1.getDesc());
        project1.elevatorPitch();
        project2.setDesc("Forgot this");
        project2.setCost(55.5);
        port1.addProject(project1);
        port1.addProject(project2);
        port1.addProject(project3);
        port1.showPortfolio();
    }
}
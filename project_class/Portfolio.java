import java.util.ArrayList;

public class Portfolio{
    private ArrayList<Project> projects;
    private double total;
    public Portfolio() {
        this.projects = new ArrayList<Project>();
    }
    public void addProject(Project project){
        this.projects.add(project);
    }
    public void getPortfolioCost(){
        double total = 0;
        for (Project i:this.projects){
            total += i.getCost();
        }
        System.out.println("Total cost is: $"+total);
    }
    public void showPortfolio(){
        for (Project i:this.projects){
            i.elevatorPitch();
        }
        this.getPortfolioCost();
    }
}
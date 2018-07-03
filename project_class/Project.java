class Project {
    private String name;
    private String desc;
    private double cost;
    public Project(){
        this.name = "";
        this.desc = "";
        this.cost = 0;
    }
    public Project(String name){
        this.name = name;
        this.desc = "";
        this.cost = 0;
    }
    public Project(String name, String desc){
        this.name = name;
        this.desc = desc;
        this.cost = 0;
    }
    public Project(String name, String desc, double cost){
        this.name = name;
        this.desc = desc;
        this.cost = cost;
    }
    public void setName(String name){
        this.name = name;
        System.out.println("Name has been changed to "+ this.name);
    }
    public void setDesc(String desc){
        this.desc = desc;
        System.out.println("Description has been changed to "+ this.desc);
    }
    public void setCost(double cost){
        this.cost = cost;
        System.out.println("Cost has been changed to "+ this.cost);
    }
    public double getCost(){
        return this.cost;
    }
    public String getName(){
        return this.name;
    }
    public String getDesc(){
        return this.desc;
    }
    public void elevatorPitch(){
        System.out.println("Name ($"+this.cost+"): "+this.name+", Description: "+this.desc);
    }
}
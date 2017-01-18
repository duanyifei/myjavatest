import sports.*;
public class FootballClass implements FootballInterFace{
    private String homeName;
    private String VisitingName;
    private int hTS;
    private int vTS;
    private int eQ;

    public void setHomeTeam(String name){
        this.homeName = name;
    }

    public void setVisitingTeam(String name){
        this.VisitingName = name;
    }
    
    public void homeTeamScored(int points){
        this.hTS = points;
    }

    public void VisitingTeamScored(int points){
        this.vTS = points;
    }

    public void endOfQuarter(int quarter){
        this.eQ = quarter;
    }

    public static void main(String [] args){
        FootballClass Ft = new FootballClass();
        Ft.setHomeTeam("sun");
        System.out.println("homeName: " + Ft.homeName);
    }
}


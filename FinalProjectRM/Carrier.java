abstract public class Carrier {
    
    private String name = "Unknown Carrier";
    private double setupCostBase = 0.00;
    private double monthlyCostBase = 0.00;
    
    public Carrier(String name){
    	this.name = name;
    }

    public void setSetUpCostBase(double setUp) {
    	this.setupCostBase = setUp;
    }
    
    public void setMonthlyCostBase(double monthlyCost) {
    	this.monthlyCostBase = monthlyCost;
    }
    
    public double getSetUpCostBase() {
    	return setupCostBase;
    }
    
    public double getMonthlyCostBase() {
    	return monthlyCostBase;
    }
    @Override
    public String toString(){
        return name;
    }
}

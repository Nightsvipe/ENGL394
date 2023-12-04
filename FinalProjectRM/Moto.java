
public class Moto extends Phone{
	private final String MANUFACTURER = "Moto";
    private final String BRAND = "Moto Phone 6";
    private Carrier carrier;
    

	
    public Moto(String carrier) {
    	switch (carrier){
    	case "Verizon": {
    		this.carrier = new Verizon(  );
    		break;
    	}//Close Verizon case
    	case "AT&T": {
    		this.carrier = new ATandT(  );
       		break;
    	}//Close AT&T case
    	case "T-Mobile": {
    		this.carrier = new Tmobile(  );
    		break;
    	}//Close T-Mobile Case
    	default: {
    		System.out.println("Unknown Carrier.  Try Again.%n");
    		break;
    	}//Close default case
    	}//Close carrier switch statment
    	this.carrier.setSetUpCostBase(20);
		this.carrier.setMonthlyCostBase(70);
    }//Close Moto constructor



	@Override
	public void initialize(boolean memberCA) {
		this.carrier.setSetUpCostBase(20);
		this.carrier.setMonthlyCostBase(70);
	}//Close initialize method
	
	@Override
    public String toString() {
        return MANUFACTURER + " " + BRAND + " on " + carrier.toString() + " - Setup cost: " + carrier.getSetUpCostBase() + ", Monthly cost: "
        		+ carrier.getMonthlyCostBase();
    }//Close toString method

}//Close Moto class

public class IPhone extends Phone {
      
    private final String MANUFACTURER = "Apple";
    private final String BRAND = "iPhone 10";
    private Carrier carrier;
    
    @Override
    public void initialize(boolean memberCA){
    	if(memberCA) {
    		carrier.setSetUpCostBase(0);
    		carrier.setMonthlyCostBase(50);
    	}
    }
    
    public IPhone( String carrier ) {
        switch (carrier){
            case "Verizon": {
                this.carrier = new Verizon(  );
                this.carrier.setMonthlyCostBase(70);
                this.carrier.setSetUpCostBase(20);
                break;
            }
            case "AT&T": {
                this.carrier = new ATandT(  );
                this.carrier.setSetUpCostBase(15);
                this.carrier.setMonthlyCostBase(60);
                break;
            }
            case "T-Mobile": {
                this.carrier = new Tmobile(  );
                this.carrier.setSetUpCostBase(10);
                this.carrier.setMonthlyCostBase(60);
                break;
            }
            default: {
                System.out.println("Unknown Carrier.  Try Again.%n");
                break;
            }
        }
        
    }
    
    @Override
    public String toString() {
        return MANUFACTURER + " " + BRAND + " on " + carrier.toString() + " - Setup cost: " + carrier.getSetUpCostBase() + ", Monthly cost: "
        		+ carrier.getMonthlyCostBase();
    }
    
}

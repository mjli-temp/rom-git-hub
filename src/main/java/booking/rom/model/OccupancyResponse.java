package booking.rom.model;

public class OccupancyResponse {
	
    private final int premiumGuests;
    private final int economyGuests;
    private final double premiumRevenue;
    private final double economyRevenue;

    public OccupancyResponse(int premiumGuests, int economyGuests, double premiumRevenue, double economyRevenue) {
        this.premiumGuests = premiumGuests;
        this.economyGuests = economyGuests;
        this.premiumRevenue = premiumRevenue;
        this.economyRevenue = economyRevenue;
    }

    public int getPremiumGuests() {
        return premiumGuests;
    }

    public int getEconomyGuests() {
        return economyGuests;
    }

	public double getPremiumRevenue() {
		return premiumRevenue;
	}

	public double getEconomyRevenue() {
		return economyRevenue;
	}


    
}

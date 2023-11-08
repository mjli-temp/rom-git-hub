package booking.rom.model;

public class OccupancyRequest {
	
	private final int freePremiumRooms;
    private final int freeEconomyRooms;
    private final double[] willingnessToPay;

    public OccupancyRequest() {
        this.freePremiumRooms = 0;
        this.freeEconomyRooms = 0;
        this.willingnessToPay = null;
	}
    
    public OccupancyRequest(int freePremiumRooms, int freeEconomyRooms, double[] willingnessToPay) {
        this.freePremiumRooms = freePremiumRooms;
        this.freeEconomyRooms = freeEconomyRooms;
        this.willingnessToPay = willingnessToPay;
    }

    public int getFreePremiumRooms() {
        return freePremiumRooms;
    }

    public int getFreeEconomyRooms() {
        return freeEconomyRooms;
    }

    public double[] getWillingnessToPay() {
        return willingnessToPay;
    }
    
}

package booking.rom.controllers;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import booking.rom.model.OccupancyRequest;
import booking.rom.model.OccupancyResponse;

@RestController
public class RoomOccupancyController {

    @PostMapping("/occupancy")
    public OccupancyResponse getOccupancy(@RequestBody OccupancyRequest request) {
    	
        int freePremiumRooms = request.getFreePremiumRooms();
        int freeEconomyRooms = request.getFreeEconomyRooms();
        double[] willingnessToPay = request.getWillingnessToPay();

        Arrays.sort(willingnessToPay);

        int premiumGuests = 0;
        int economyGuests = 0;
        double premiumRevenue = 0;
        double economyRevenue = 0;

        //FIXME add code here
        
        
        return new OccupancyResponse(premiumGuests, economyGuests, premiumRevenue, economyRevenue);
        
    }
    
} 
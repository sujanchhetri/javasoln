import java.util.*;

public class ComputerCarMileage {
    public static void main(String[] args)
    {
int  work_days_per_week = 5,weeks_to_work_per_year = 50,car_loan = 5,round_trips_per_day = 36;
int  total_mileage_covered;
        
total_mileage_covered = work_days_per_week * weeks_to_work_per_year *  car_loan * round_trips_per_day; 

        System.out.println("My Car have "+total_mileage_covered+" miles after "+car_loan+" years by driving "+round_trips_per_day+" miles per workday"); 
	}
}

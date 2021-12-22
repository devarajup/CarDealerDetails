package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("abc", 20, 12000D);
        Car car2 = new Car("def", 10, 13000D);
        Car car3 = new Car("geh", 12, 14000D);
        Car car4 = new Car("ijk", 15, 16000D);
        Car car5 = new Car("lmn", 18, 17000D);

        DealerDetails dealer1 = new DealerDetails("Hero-hyd", "Hyderabad", "9059876825", Arrays.asList(car1, car2));
        DealerDetails dealer2 = new DealerDetails("Hero-wgl", "Warangal", "9059776825", Arrays.asList(car3, car4, car5));

        List<DealerDetails> dealerDetailsList = Arrays.asList(dealer1, dealer2);
/*            for (DealerDetails details : dealerDetailsList) {

        System.out.println("Dealer name : " + details.getName() + " Address : " + details.getAddress() + " Phone number :" + details.getPhoneNo());
        for (Car car : details.getCars()) {
            System.out.println("Car model :" + car.getName() + " Quantity :" + car.getQty() + " Price :" + car.getPrice());

        }
        }*/
       /* dealerDetailsList.forEach(details -> {
            System.out.println("Dealer name : " + details.getName() + " Address : " + details.getAddress() + " Phone number :" + details.getPhoneNo());
            details.getCars().forEach(car -> System.out.println("Car model :" + car.getName() + " Quantity :" + car.getQty() + " Price :" + car.getPrice())
            );
        });*/

 /*       dealerDetailsList.stream().map(dealerDetails -> {
            dealerDetails.setName(dealerDetails.getName() + "-dealer");
            return dealerDetails;
        }).forEach(details -> {
            System.out.println("Dealer name : " + details.getName() + " Address : " + details.getAddress() + " Phone number :" + details.getPhoneNo());
            details.getCars().forEach(car -> System.out.println("Car model :" + car.getName() + " Quantity :" + car.getQty() + " Price :" + car.getPrice()));
        });*/
        dealerDetailsList.stream().forEach(details -> {
            System.out.println("Dealer name : " + details.getName() + " Address : " + details.getAddress() + " Phone number :" + details.getPhoneNo());
            details.getCars().stream().filter(car -> car.getQty() > 15).sorted().forEach(car -> System.out.println("Car model :" + car.getName() + " Quantity :" + car.getQty() + " Price :" + car.getPrice()));
        });
    }
}

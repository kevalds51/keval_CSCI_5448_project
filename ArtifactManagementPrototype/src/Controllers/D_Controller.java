package Controllers;

import Models.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

public class D_Controller {

    public static void main(String args[]) {

        artifactStatus closed = new artifactStatus("closed");
        artifactStatus open = new artifactStatus("open");

        ArrayList<Artifact> s1 = new ArrayList<Artifact>();
        s1.add(new Artifact(1001, "Keval's Vase", "Keval", closed, 10000));
        s1.add(new Artifact(1009, "Mike's Vase", "Mike", closed, 20001));
        s1.add(new Artifact(1002, "Black Rose", "Jake", closed, 13402));
        s1.add(new Artifact(1003, "Eternity Diamond", "Hank", closed, 8054));
        s1.add(new Artifact(1004, "Red Eyes", "Raj", closed, 7364));
        s1.add(new Artifact(1005, "Pink Statue", "Viz", closed, 1005));
        s1.add(new Artifact(1006, "Tome", "Donna", closed, 97634));
        s1.add(new Artifact(1007, "Dragon Painting", "Lee", closed, 437));

        // Establish a Models.Museum
        Museum myMuseum = new Museum("CU Models.Museum", s1);

        // Add a Models.Curator, an Models.Administrator and an Models.Auctioneer
        Curator theCurator = new Curator("A B Models.Curator", 777, 44, "123 Colorado Ave", "ezpass", 100000, new Date(1504587433443L));
        Administrator admin = new Administrator("X Y Admin", 420, 42, "223 Colorado Ave", "!ezpass", 10000, new Date(1404587493443L), "2ezpass");
        Auctioneer adamAuctioneer = new Auctioneer("Adam Amaze", 121, 23, "323 Mapleton Ave", "adam1", 10032, new Date(1204587475243L));

        // Create a Collector
        ArtCollector collector1 = new ArtCollector("Rich Guy 1", 123, 22, "Boston", "poor1");
        ArtCollector collector2 = new ArtCollector("Rich Guy 2", 124, 23, "Lowell", "poor2");

        // The Models.Curator and Models.Administrator login.
        System.out.println(theCurator.loginUser(777, "ezpass"));
        System.out.println(admin.loginUser(420, "!ezpass"));
        System.out.println(adamAuctioneer.loginUser(121, "adam1"));

        // Register and Loing the Collector
        System.out.println(collector1.loginUser(123, "poor1"));
        System.out.println(collector1.registerCollector());
        System.out.println(collector1.loginUser(123, "po3or"));
        System.out.println(collector1.loginUser(123, "poor1"));

        System.out.println(collector2.registerCollector());
        System.out.println(collector2.loginUser(124, "poor2"));

        // Print the employee details
        System.out.println(theCurator.getJoinDate());
        System.out.println(theCurator.getEmploymentTime());
        System.out.println(admin.getJoinDate());
        System.out.println(admin.getEmploymentTime());

        // The Collector can access the Models.Museum collection.
        collector1.viewMuseumCollection(myMuseum);

        // The collector wants to view the Models.Museum collection after curator's update
        collector1.viewMuseumCollection(myMuseum);

        // ---- Adding items to the collectors inventory ---- //

        // Add a few artifacts to the collector
        ArrayList<Artifact> s2 = new ArrayList<Artifact>();
        s2.add(new Artifact(1031, "XYZ's Vase", "X", closed, 10000));
        s2.add(new Artifact(1039, "PQR's Vase", "P", closed, 20001));
        collector1.setMyArtifacts(s2);

        // ---- Collector wants to sell something to the museum ---- //

        // The collector send a request to sell one of his artifacts.
        System.out.println(collector1.submitSaleRequest(myMuseum, 1031, 10000));
        System.out.println("# Sale requests: "+myMuseum.getSaleRequests().size());
        // The collector decides to send another request with higher sell price.
        System.out.println(collector1.submitSaleRequest(myMuseum, 1031, 12000));
        System.out.println("# Sale requests: "+myMuseum.getSaleRequests().size());
        // The Models.Curator evaluates the Sale Requests
        System.out.println(theCurator.evaulateSalesRequests(myMuseum));
        System.out.println("# Sale requests: "+myMuseum.getSaleRequests().size());

        // ---- The curator decides to put up an Models.Artifact for auction! ---- //
        Auction anAuction = theCurator.declareAuction(myMuseum,  1002, open, new Date(), adamAuctioneer, 1000);
        // Get the list of open auctions
        myMuseum.printOpenAuctions();

        // Bidders submit their bids
        collector2.submitBid(myMuseum, 1000, 14200);
        collector1.submitBid(myMuseum, 1000, 14100);

        // Models.Auctioneer hosts the auction and declares the winner
        System.out.println(anAuction.getAuctioneer().hostAuction(anAuction, myMuseum));

        System.out.println(admin.processRequests(myMuseum));

        collector2.viewMyTransactions();

        // Print employee reports
        admin.printEmployeeReport();
        theCurator.printEmployeeReport();
        adamAuctioneer.printEmployeeReport();
    }
}
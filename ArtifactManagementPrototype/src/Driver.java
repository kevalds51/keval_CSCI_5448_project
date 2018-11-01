import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

public class Driver {

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

        // Establish a Museum
        Museum myMuseum = new Museum("CU Museum", s1, null, null, null);

        // Add a Curator and an Administrator
        Curator theCurator = new Curator("A B Curator", 777, 44, "123 Colorado Ave", "ezpass", 100000, new Date());
        Administrator admin = new Administrator("X Y Admin", 420, 42, "223 Colorado Ave", "!ezpass", 10000, new Date(), "2ezpass");

        // Create a Collector
        ArtCollector collector1 = new ArtCollector("Rich Guy 1", 123, 22, "Boston", "poor");

        // The Curator and Administrator login.
        System.out.println(theCurator.loginUser(777, "ezpass"));
        System.out.println(admin.loginUser(420, "!ezpass"));

        // Register and Loing the Collector
        System.out.println(collector1.loginUser(123, "poor"));
        System.out.println(collector1.registerCollector());
        System.out.println(collector1.loginUser(123, "po3or"));
        System.out.println(collector1.loginUser(123, "poor"));

        // The Collector can access the Museum collection.
        collector1.viewMuseumCollection(myMuseum);

        // The curator decides to put up an Artifact for auction!
        // Museum, auctioneerID, date, aucitonID, artifactID
        theCurator.declareAuction(myMuseum,  1002, open,new Date(), 101, 1000);

        // The collector wants to view the Museum collection after curator's update
        collector1.viewMuseumCollection(myMuseum);
        // Get the list of open auctions
        myMuseum.printOpenAuctions();
    }
}
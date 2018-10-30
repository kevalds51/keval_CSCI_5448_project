import java.util.ArrayList;
import java.util.Set;

public class Driver {

    public static void main(String args[]) {

        artifactStatus closed = new artifactStatus("closed");
        artifactStatus open = new artifactStatus("open");


        Artifact a1 = new Artifact(1001, "Keval's Vase", "Keval", closed, 10000);
        Artifact a2 = new Artifact(1002, "Mike's Vase", "Mike", open, 10001);

        ArrayList<Artifact> s1 = new ArrayList<Artifact>();
        s1.add(a1);
        s1.add(a2);

        Museum myMuseum = new Museum("CU Museum", s1, null, null, null);
        myMuseum.printArtifactCollection();
    }
}
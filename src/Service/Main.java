package Service;
import Entities.Spid;
import Entities.User;
import Utilities.Status;

public class Main {
    public static void main(String[] args) {
        SpidService spdManager = new SpidService();
        UserService userManager = new UserService();

        try {

            User newUser = userManager.createUser("paola", "caustic", "paola123");
            System.out.println(newUser);


            Spid newSpd = spdManager.createSpid(newUser);
            System.out.println(newSpd);

            spdManager.approveSpid(1);


            spdManager.showList();


            System.out.println(userManager.showSpidOf("paola"));


            userManager.modifyUser("paola", null, "payola");


            spdManager.modifySpid(1, Status.FOR_REVIEW);
            System.out.println(newSpd);
        } catch (Exception err) {
            System.out.println("ERROR!");
        }
    }
}

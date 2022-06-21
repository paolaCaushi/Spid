package Service;
import Entities.Spid;
import Entities.User;
import Utilities.Datas;
import Utilities.Status;
import java.util.*;
import java.util.Date;

public class SpidService {
    private final List<Spid> data = new ArrayList<>();
    private final Datas datas = new Datas();

    public Spid getSpid(long id) throws Exception {
        for (Spid datum : data) {
            if (datum.getId() == id) {
                return datum;
            }
        }
        throw new Exception(String.format("Spid with id:'%d' does not exists!", id));
    }

    public Spid createSpid(User user) {
        long id = datas.datas();
        Spid spd = new Spid(id, new Date(), user);
        user.setSpid(spd);
        data.add(spd);
        System.out.printf("Spid %d created successfully!%n", id);
        return spd;
    }
    public void modifySpid(long id, Status status) throws Exception {
        getSpid(id).setStatus(status);
    }
    public void approveSpid(long id) throws Exception {
        getSpid(id).setStatus(Status.APPROVED);
    }


    public void showList() {
        System.out.println("\nList  : ");
        data.forEach(el -> System.out.println("\t" + el));
    }
}


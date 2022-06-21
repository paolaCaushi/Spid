package Service;
import Entities.Spid;
import Entities.User;
import Utilities.Datas;
import Utilities.Status;
import java.util.*;
import java.util.Date;

public class SpidService {
    private List<Spid> data = new ArrayList<Spid>();
    private Datas datas = new Datas();

    public Spid getSpid(long id) throws Exception {
        for (int i = 0; i < data.size(); ++i) {
            if (data.get(i).getId() == id) {
                return data.get(i);
            }
        }
        throw new Exception(String.format("Spid with id:'%d' does not exists!", id));
    }

    public Spid createSpid(User user) {
        long id = datas.datas();
        Spid spd = new Spid(id, new Date(), user);
        user.setSpid(spd);
        data.add(spd);
        System.out.println(String.format("Spid %d created successfully!", id));
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


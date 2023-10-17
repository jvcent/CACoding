package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearOutputData {
    private ArrayList<String> deleted_users;

    public ClearOutputData(ArrayList<String> deleted_users) {
        this.deleted_users = deleted_users;
    }

    public ArrayList<String> getDeleted_users() { return deleted_users;}
}

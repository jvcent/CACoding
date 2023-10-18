package interface_adapter.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearState {
    private ArrayList<String> deleted_users = new ArrayList<>();

    public ClearState(ClearState copy) {
        deleted_users = copy.deleted_users;
    }

    public ArrayList<String> getDeleted_users() {return deleted_users;}
}

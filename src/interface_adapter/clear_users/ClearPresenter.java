package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

import java.util.ArrayList;

public class ClearPresenter implements ClearOutputBoundary {
    private final SignupViewModel signupViewModel;
    private ViewManagerModel viewManagerModel;

    public ClearPresenter(SignupViewModel signupViewModel, ViewManagerModel viewManagerModel) {
        this.signupViewModel = signupViewModel;
        this.viewManagerModel = viewManagerModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData users) {
        // Popout to be added here
        System.out.println("Users have been cleared");
        ArrayList<String> deleted_users = users.getDeleted_users();
    }
}

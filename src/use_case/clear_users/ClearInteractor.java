package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject, ClearOutputBoundary clearPresenter) {
        this.userDataAccessObject = userDataAccessObject;
        this.clearPresenter = clearPresenter;
    }

    public void execute(ClearOutputData clearOutputData){
        clearOutputData.setDeleted_users(userDataAccessObject.clear());
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}

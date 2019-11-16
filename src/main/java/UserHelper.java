public class UserHelper extends PageManager {
    public UserHelper() {
        super(AppManager.getWebDriver());
    }

    public void searchForRepo(String text) {
        homePage.searchForRepository(text);
    }

    public void selectFirstResult() {
        searchPage.selectFirstSearchResult();
    }

    public String getSearchValue() {
        return homePage.getSearchFieldValue();
    }

    public void loginAs(String login, String pass) {
        logInPage.loginInput(login);
        logInPage.passwordInput(pass);
        logInPage.loginSubmit();
    }

    public void showMenu() {
        homePage.showMenu();
    }

    public String getProfileName() {
        return homePage.getProfileName();
    }

    public void goToBlog() {
        homePage.goToBlog();
    }

    public String getLogoName() {
        return blogPage.getLogoName();
    }

    public String getPostsHeader() {
        return blogPage.getPostsHeader();
    }

    public int getFilesNumber() {
        return repositoryPage.getFilesNumber();
    }

    public int getDirectoriesNumber() {
        return repositoryPage.getDirectoriesNumber();
    }
}

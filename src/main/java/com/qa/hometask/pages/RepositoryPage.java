package com.qa.hometask.pages;

import com.qa.hometask.manageres.PageManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class RepositoryPage extends Page {

    public RepositoryPage(PageManager pages) {
        super(pages);
    }

    @FindBy(xpath = "//tbody/tr[td[@class='icon']/*[name()='svg'][@aria-label='file']]")
    private List<WebElement> filesList;
    @FindBy(xpath = "//tbody/tr[td[@class='icon']/*[name()='svg'][@aria-label='directory']]")
    private List<WebElement> directoriesList;

    @Step("Get the number of files")
    public int getFilesNumber() {
        wait.until(ExpectedConditions.visibilityOf(filesList.get(0)));
        return filesList.size();
    }

    @Step("Get the number of directories")
    public int getDirectoriesNumber() {
        wait.until(ExpectedConditions.visibilityOf(directoriesList.get(0)));
        return directoriesList.size();
    }
}

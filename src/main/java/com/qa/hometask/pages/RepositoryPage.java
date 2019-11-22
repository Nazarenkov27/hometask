package com.qa.hometask.pages;

import com.qa.hometask.manageres.PageManager;
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

    public int getFilesNumber() {
        wait.until(ExpectedConditions.visibilityOf(filesList.get(0)));
        int filesCount = filesList.size();
        return filesCount;
    }

    public int getDirectoriesNumber() {
        wait.until(ExpectedConditions.visibilityOf(directoriesList.get(0)));
        int directoriesCount = directoriesList.size();
        return directoriesCount;
    }
}

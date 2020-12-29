package cucumber.demoqa.sortable.page;

import static com.codeborne.selenide.Selenide.*;

public class ListPage extends SortablePage<ListPage>
{
    public void dragDiv(String fromDivText, String toDivText)
    {
        var selectorFormat = "//*[@id=\"demo-tabpane-list\"]/div/div[text()='%s']";
        var fromDiv = $x(String.format(selectorFormat, fromDivText));
        var toDiv = $x(String.format(selectorFormat, toDivText));
        actions()
                .dragAndDrop(fromDiv, toDiv)
                .build()
                .perform();
    }

    public Integer getDivIndex(String divText)
    {
        var selectorFormat = "//*[@id='demo-tabpane-list']/div/div[text()='%s']/preceding-sibling::div";
        return $$x(String.format(selectorFormat, divText)).size() + 1;
    }
}

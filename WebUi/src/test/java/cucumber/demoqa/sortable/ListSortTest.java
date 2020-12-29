package cucumber.demoqa.sortable;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableBiMap;
import cucumber.demoqa.sortable.page.ListPage;
import cucumber.demoqa.sortable.page.SortablePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.AbstractTest;

import static org.junit.Assert.assertEquals;

public class ListSortTest extends AbstractTest<ListPage>
{
    protected BiMap<Integer, String> map = HashBiMap.create();

    public ListSortTest()
    {
        var i = 1;
        map.put(i++, "One");
        map.put(i++, "Two");
        map.put(i++, "Three");
        map.put(i++, "Four");
        map.put(i++, "Five");
        map.put(i++, "Six");
    }

    private String fromDiv;
    private String toDiv;

    @Given("url = {string} and list tab selected")
    public void urlAndListTabSelected(String url)
    {
        page = open(url, ListPage.class, SortablePage::switchToListTab);
    }

    @When("div {string} is dragged to {string}")
    public void divFromDivIsDraggedToToDiv(String fromDiv, String toDiv)
    {
        this.fromDiv = fromDiv;
        this.toDiv = toDiv;
        page.dragDiv(fromDiv, toDiv);
    }

    @Then("list is correctly sorted")
    public void listIsCorrectlySorted()
    {
        assertEquals(page.getDivIndex(fromDiv), map.inverse().get(toDiv));
//        map.inverse().get(fromDiv);
    }
}

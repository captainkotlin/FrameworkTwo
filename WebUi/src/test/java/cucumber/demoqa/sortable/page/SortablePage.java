package cucumber.demoqa.sortable.page;

import utils.AbstractPage;

import static com.codeborne.selenide.Selenide.$;

public abstract class SortablePage<T extends SortablePage<T>> extends AbstractPage<T>
{
    @SuppressWarnings("unchecked")
    public T switchToListTab()
    {
        $("#demo-tab-list").click();
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T switchToGridTab()
    {
        $("#demo-tab-grid").click();
        return (T) this;
    }
}

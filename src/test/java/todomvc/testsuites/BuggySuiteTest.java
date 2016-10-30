package todomvc.testsuites;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import todomvc.TodosOperationsAtAllFilterTest;
import todomvc.categories.Buggy;

@RunWith(Categories.class)
@Suite.SuiteClasses(TodosOperationsAtAllFilterTest.class)
@Categories.IncludeCategory(Buggy.class)
public class BuggySuiteTest {
}

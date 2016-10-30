package todomvc.testsuites;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import todomvc.TodosE2ETest;
import todomvc.categories.Buggy;
import todomvc.categories.Smoke;

@RunWith(Categories.class)
@Suite.SuiteClasses(TodosE2ETest.class)
@Categories.IncludeCategory(Smoke.class)
@Categories.ExcludeCategory(Buggy.class)
public class SmokeSuiteTest {
}

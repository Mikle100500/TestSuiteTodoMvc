package com.todomvc.testsuites;

import com.todomvc.categories.Buggy;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import com.todomvc.TodosOperationsAtAllFilterTest;

@RunWith(Categories.class)
@Suite.SuiteClasses(TodosOperationsAtAllFilterTest.class)
@Categories.ExcludeCategory(Buggy.class)
public class FullAcceptanceSuiteTest {
}

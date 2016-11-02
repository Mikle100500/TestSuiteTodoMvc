package com.todomvc.testsuites;

import com.todomvc.TodosOperationsAtAllFilterTest;
import com.todomvc.categories.Buggy;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses(TodosOperationsAtAllFilterTest.class)
@Categories.IncludeCategory(Buggy.class)
public class BuggySuiteTest {
}

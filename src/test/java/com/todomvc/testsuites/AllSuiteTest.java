package com.todomvc.testsuites;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import com.todomvc.TodosOperationsAtAllFilterTest;

@RunWith(Categories.class)
@Suite.SuiteClasses(TodosOperationsAtAllFilterTest.class)
public class AllSuiteTest {
}

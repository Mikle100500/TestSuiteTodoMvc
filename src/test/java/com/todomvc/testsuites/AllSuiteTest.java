package com.todomvc.testsuites;

import com.todomvc.TodosE2ETest;
import com.todomvc.TodosOperationsAtAllFilterTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({TodosOperationsAtAllFilterTest.class, TodosE2ETest.class})
public class AllSuiteTest {
}
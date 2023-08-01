package com.curso.android.app.practica.apppracticauno;

import org.junit.runner.RunWith;

public class ComparisonViewModelTest @RunWith(JUnit4.class)
public class ComparisonViewModelTest {

    private ComparisonViewModel viewModel;

    @Before
    public void setUp() {
        viewModel = new ComparisonViewModel();
    }

    @Test
    public void testComparison() {
        viewModel.setNumber1(5);
        viewModel.setNumber2(10);
        assertEquals("Número 2 es mayor que Número 1", viewModel.getComparisonResult().getValue());

        viewModel.setNumber1(20);
        viewModel.setNumber2(20);
        assertEquals("Los números son iguales", viewModel.getComparisonResult().getValue());

        viewModel.setNumber1(30);
        viewModel.setNumber2(25);
        assertEquals("Número 1 es mayor que Número 2", viewModel.getComparisonResult().getValue());
    }
}
}

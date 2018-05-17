package ejercicio1Test;


import java.lang.annotation.*;

import org.junit.experimental.theories.*;

@Retention(RetentionPolicy.RUNTIME)
@ParametersSuppliedBy(ListGenerator.class)
public @interface ListGen {
	int minInt();
	int maxInt();
	int minSize();
	int maxSize();
	int amountLists();
}

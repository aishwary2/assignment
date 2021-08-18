package com.yash.tdddemo.util;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParametrizedTest {

	@ParameterizedTest
	@ValueSource(strings= {"hello","World"})
	void shouldPassNonNullMessageAsMethodParameter(String message) {
		assertNotNull(message);
	}

}

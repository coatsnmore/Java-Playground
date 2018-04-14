package com.coatsn.javastuff;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public interface FancyPrinterInterface {

	default void printFancy() {
		System.out.println("fancy: " + ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE));
	};
}

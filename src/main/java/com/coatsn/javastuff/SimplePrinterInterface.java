package com.coatsn.javastuff;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public interface SimplePrinterInterface {

	default void printSimple() {
		System.out.println("simple: " + ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE));
	}
}

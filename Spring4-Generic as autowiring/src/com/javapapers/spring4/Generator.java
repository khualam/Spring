package com.javapapers.spring4;

import org.springframework.stereotype.Component;

public interface Generator<T> {

	T generate();
}
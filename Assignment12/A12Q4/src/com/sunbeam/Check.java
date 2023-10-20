package com.sunbeam;

@FunctionalInterface
interface Check<T> {
	boolean compare(T x, T y);
}

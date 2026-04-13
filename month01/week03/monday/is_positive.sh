#!/bin/bash

is_positive() {
	NUMBER=1
	if [ $NUMBER -gt 0 ]; then
		echo "$NUMBER is Positive number"
	else 
		echo "$NUMBER is Negative number"
	fi
}
is_positive

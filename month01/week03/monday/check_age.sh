#!/bin/bash

check_age() {
	AGE=24
	if [ $AGE -ge 18 ]; then
		echo "Adult"
	else
		echo "Kid"
	fi
}

check_age

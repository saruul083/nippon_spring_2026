#!/bin/bash

login() {
	user=$1
	if [ "$user" == "admin123" ]; then
		echo "Access granted"
	else
		echo "Wrong password"
	fi
}

login "admin123"

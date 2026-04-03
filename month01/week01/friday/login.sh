#!/bin/bash

PASSWORD=$1

if [ "$PASSWORD" = 1234 ]; then
	echo "Access granted"
else
	echo "Access denied"
fi

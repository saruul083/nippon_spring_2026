#!/bin/bash

AGE=$1

if [ $AGE -ge 18 ]; then
	echo "You are adult"
else 
	echo "You are kid"
fi

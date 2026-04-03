#!/bin/bash

NAME=$1

if [ -z $1 ]; then
	echo "Please type name!"
else
	echo "Hello, $1"
fi

#!/bin/bash

AGE=$1


if [ $AGE -ge 18 ]; then
	echo "you can vote"
else 
	echo "you can't vote"
fi

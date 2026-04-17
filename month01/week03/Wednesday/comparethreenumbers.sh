#!/bin/bash

read -p "Give me A: " A
read -p "Give me B: " B
read -p "Give me C: " C

if [ $A -lt $B ]; then
	temp=$B
	B=$A
	A=$temp
fi

if [ $B -lt $C ]; then
	temp=$C
	C=$B
	B=$temp
fi

if [ $A -lt $B ]; then
	temp=$B
	B=$A
	A=$temp
fi

echo "$A > $B > $C"
	

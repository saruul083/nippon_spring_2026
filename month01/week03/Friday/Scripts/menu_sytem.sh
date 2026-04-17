#!/bin/bash

read -p "Please enter any number(1-10), enter 0 to quit: " N

if [ $N -eq 0 ]; then
        exit 0
fi

while [ $N -le 10 ]; do 
	for ((i=1; i<=10; i++)); do
		SUM=$((i * N))
		echo "$N * $i = $SUM"
	done
	read -p "Please enter any number(1-10), enter 0 to quit: " N
	if [ $N -eq 0 ]; then
        exit 0
	fi
done

#!/bin/bash

PASSWORD=42
read -p "Guess the number!: " N

if [ $PASSWORD -eq $N ]; then
	echo "Congratulations!"
else
	while [ $PASSWORD -ne $N ]; do

		if [ $PASSWORD -lt $N ]; then
			read -p "$N was greater than number: " N
		else 	
			read -p "$N was lesser than number: " N
		fi
	done
	echo "Congratulations!"
fi



	

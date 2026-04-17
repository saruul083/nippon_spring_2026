#!/bin/bash

read -p "Please enter 1st number: " A
read -p "Please enter operator (+, -, *, /): " operator
read -p "Please enter 2nd number: " B

if [[ "$operator" == "+" ]]; then
	SUM=$((A + B))
        echo "$A $operator $B = $SUM"
elif [[ "$operator" == "-" ]]; then
        SUM=$((A - B))
        echo "$A $operator $B = $SUM"
elif [[ "$operator" == "*" ]]; then
        SUM=$((A * B))
        echo "$A $operator $B = $SUM"
elif [[ "$operator" == "/" && $B -eq 0 ]]; then
        echo "Error!"
elif [[ "$operator" == "/" ]]; then
        SUM=$((A / B))
	echo "$A $operator $B = $SUM"
else
	echo "Please enter either +, -, *, / on operator"
fi

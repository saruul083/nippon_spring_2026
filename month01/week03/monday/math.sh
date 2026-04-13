#!/bin/bash

math() {
	sum=$(($1 + $2))
	sub=$(($1 - $2))
	mul=$(($1 * $2))
	echo "Sum : $sum"
	echo "Substruct: $sub"
	echo "Multiply: $mul"
}

math 5 4	

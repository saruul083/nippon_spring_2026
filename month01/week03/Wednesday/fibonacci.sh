#!/bin/bash

counter=1
A=0
B=1
C=0
count=$1

while [ $count -gt $counter ]; do
	C=$((A + B))
	A=$B
	B=$C
	counter=$((counter + 1))
done
	echo "$C"

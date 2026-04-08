#!/bin/bash

add() {
	local a=$1
	local b=$2
	echo $((a + b))
}

result=$(add 5 3)
echo "Sum: $result"
result=$(add 2 10)
echo "Sum: $result"
result=$(add 3 20)
echo "Sum: $result"


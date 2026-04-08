#!/bin/bash

count=$1

while [ $count -ge 1 ]; do
	echo "Number: $count"
	count=$((count - 1))
done
echo "Finished"

#!/bin/bash
max=0
for i in {1..5}; do
    read -p "Enter number $i: " num
    	if [ $max -lt $num ]; then
		max=$num		
  	fi
done
echo "Highes number is $max"

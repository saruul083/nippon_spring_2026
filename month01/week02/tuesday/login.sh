#!/bin/bash

limit=3
CORRECT="icode2026"

while [ $limit -gt 0 ]; do
	read -p "Enter password: " password

	if [ "$password" = "$CORRECT" ]; then
	 echo "Accessed!"
	 exit 0
	else
	 limit=$((limit -1))
	 if [ $limit -gt 0 ]; then
		echo "Wrong password. $limit tries left"
	 else 
		echo "Blocked"
	 fi
	fi
done

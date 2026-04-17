#!/bin/bash

PRICE=2500
MONEY=$1

while [ $MONEY -lt $PRICE ]; do
	insufficient_money=$((PRICE - MONEY))
	read -p "not enough $insufficient_money: " money
	MONEY=$((money + MONEY))
done

	change=$((MONEY - PRICE))
	echo "Here is your drink and your change:  $change" 	

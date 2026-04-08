#!/bin/bash

read -p "First number: " numberone
read -p "Operator (+, -, *, /): " operator
read -p "Second number: " numbertwo
case $operator in
	"+") echo "$((numberone + numbertwo))" ;;
	"-") echo "$((numberone - numbertwo))" ;;
	"*") echo "$((numberone * numbertwo))" ;;
	"/") echo "$((numberone / numbertwo))" ;;
	*) echo "Doesn't exit operator" ;;
esac

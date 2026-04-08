#!/bin/bash

read -p "Enter what month: " month

case $month in
	1) echo "Winter" ;;
	2) echo "Winter" ;;
	3) echo "Spring" ;;
	4) echo "Spring" ;;
	5) echo "Spring" ;;
	6) echo "Summer" ;;
	7) echo "Summer" ;;
	8) echo "Summer" ;;
	9) echo "Autumn" ;;
	10) echo "Autumn" ;;
	11) echo "Autumn" ;;
	12) echo "Winter" ;;
	*) echo "that month doesn't exit" ;;
esac

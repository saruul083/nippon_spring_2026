#!/bin/bash


if [ $(date "+%H") -le 12 ]; then
	echo "Good morning!"
else
	echo "Good evening!"
fi	

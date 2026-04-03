#!/bin/bash

NUMBERONE=$1
NUMBERTWO=$2

if [ $NUMBERONE -gt $NUMBERTWO ]; then
	echo "$NUMBERONE is greater"
fi

if [ $NUMBERONE -lt $NUMBERTWO ]; then
	echo "$NUMBERTWO is greater"
fi

if [ $NUMBERONE -eq $NUMBERTWO ]; then
	echo "Both numbers are equal"
fi

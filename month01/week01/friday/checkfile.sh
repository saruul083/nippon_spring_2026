#!/bin/bash

FILENAME=$1

if [ -f "$FILENAME" ]; then
	echo "Found $1"
else 
	echo "Not found $1"
fi 

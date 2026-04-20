#!/bin/bash

FOLDER=$1
RENAME=$2

if [ -d "$RENAME" ]; then
	echo "Already existing folder name"
else
	mv "$FOLDER" "$RENAME"
fi

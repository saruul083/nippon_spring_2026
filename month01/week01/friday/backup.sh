#!/bin/bash

FILENAME=$1

if [ -f "$FILENAME" ]; then
	cp "$FILENAME" "${FILENAME%???}".bak
else
	echo "Did not find $FILENAME"
fi

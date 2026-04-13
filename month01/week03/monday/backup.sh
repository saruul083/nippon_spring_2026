#!/bin/bash

backup() {
	FILENAME=$1
	
	if [ -f "$FILENAME" ]; then
		cp "$FILENAME" "${FILENAME%???}".bak
	fi
}

backup $1

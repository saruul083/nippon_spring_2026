#!/bin/bash

FOLDERNAME=$1

if [ -d "$FOLDERNAME" ]; then
	cd $FOLDERNAME && ls
else
	echo "Not found $FOLDERNAME"
fi

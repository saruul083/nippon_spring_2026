#!/bin/bash

FOLDERNAME=$1

if [ -d "$FOLDERNAME" ]; then
	echo "Already exiting folder"
else
	mkdir "$FOLDERNAME"
	echo "Successfully Created folder!"
fi

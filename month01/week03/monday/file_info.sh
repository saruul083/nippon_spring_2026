#!/bin/bash

file_info() {
	FILENAME=$1
	echo "Line: $(cat $FILENAME | wc -l)"
	echo "Words: $(cat $FILENAME | wc -w)"
}

file_info greet.sh 

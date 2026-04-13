#!/bin/bash

remove_file() {
	FILENAME=$1
	read -p "Are you sure to delete $1?(Y/N): " file
	case $file in
		"Y") rm $1 ;;
		"N") exit 0 ;;
		*) echo "Please type Y or N" ;;
	esac
}
remove_file $1

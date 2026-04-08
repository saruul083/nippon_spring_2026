#!/bin/bash

read -p "Menu: (1-3) " menu

case $menu in
	1) echo "$(whoami)" ;;
	2) echo "$(date)" ;;
	3) exit 0 ;;
	*) echo "Doesn't exit menu"
esac

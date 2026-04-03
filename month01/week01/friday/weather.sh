#!/bin/bash

WEATHER=$1

if [ "$WEATHER" = "sunny" ]; then
	echo "Wear T-shirt"
fi

if [ "$WEATHER" = "rainy" ]; then
	echo "Wear jacket"
fi

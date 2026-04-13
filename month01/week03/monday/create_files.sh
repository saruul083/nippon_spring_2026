#!/bin/bash

create_files() {
	touch $1.html
	touch $1.css
	touch $1.js
}

create_files "testing"

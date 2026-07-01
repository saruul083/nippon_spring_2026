console.log('Javascript Functions');

// Javascript Interpreter

// alert("This is alert");
// Broswer API

const result = prompt('What is your name')

// function declaration - parameter
function greet(name) {
	return `Hello, my name is ${name}`;
}

//function call = argument

console.log(greet(result));

function add(a, b) {
	return a + b;
}

console.log(add(5,6));

function inroduce(name, age) {
	console.log(`My name is ${name} and i'm ${age} years old`);
}

inroduce('Saka', 24);

function printSum(a, b) {
	console.log(a + b);
}

const printSumResult = printSum(5, 6);
console.log(printSumResult);

// function expression - anonymous function
const minus = function (a, b) {
	return a - b;
}

console.log(minus(5, 2));

// arrow function expression
const substract = (a, b) => {
	return a - b;
}
console.log(substract(10, 6));

function divine(a, b) {
	return a / b;
}
console.log(divine(6, 2));

function multiply(a, b) {
	return a * b;
}
console.log(multiply(5, 3));

const power = function (a, b) {
	return a ** b;
}

console.log(power(2, 4));

const circleArea = (r) => {
	return r * r * Math.PI;
}

console.log(circleArea(2));

const min = (a, b) => {
	if (a > b) {return b;}
	else {return a};
}

console.log(min(3, 1));

const isAdult = (age) => {
	if (age >= 18) return 'You are adult';
	return 'You are not adult';
}

console.log(isAdult(10));


// Object Literal
console.log('=============================');
console.log('Object Literal');


// object literal
// name, age => keys
//Sarah, 20 => values
// Javascript object notation
const student = {
	name: 'Sarah',
	age: 20,
	score: 70
}

console.log(student);

const mixedObject = {
	name: 'Dog',
	gender: 'Male',
	age: 5,
	isBig: false,
	weight: 5.6,
	kids: ['Shiro','Kuro', 'Ao','Aka']
}

console.log(mixedObject);
// dot notation
console.log(mixedObject.age);

const complicateObjec = {
	"high-grade": 95,
	"low-grade": 45
};
// bracket notation
console.log(complicateObjec["high-grade"])

mixedObject.name = 'Cat';

complicateObjec["high-grade"] = 85;

console.log(mixedObject.name);
console.log(complicateObjec["high-grade"]);

const funcObject = {
	name: 'Bird',
	color: "Black",
	say: function(){
		console.log('Guag Guag');
	}
};

funcObject.say();

const createCourse = (title, week) => {
	return {
		title,
		week
	};
};

console.log(createCourse('Javascript', 3))

function isPassingStudent(student) {
	if(student.score >= 60) return console.log('Passed');
		return console.log('Failed');
}

isPassingStudent(student);

const students = [
	{ name: "Bataa", score:82},
	{ name: "Saraa", score:94},
	{ name: "Dorj", score:58}
];
const totalStudents = students.length;

const averageScore = (students) => {
	let sum = 0;
	for(const student of students) {
		sum += student.score;
	}
	return sum / totalStudents;
}
console.log(totalStudents);
console.log(averageScore(students));

// difference of function expression VS funcation declaration

printMe();

function printMe() {
	console.log("Hello");
}

printMe();

// console.log(a);
const a = 6;

const printMeFunc = function(){
	console.log("Hello");
}

printMeFunc();
console.log('Hello Javascript');

// javascript data types

console.log(typeof "Hello World"); //string
console.log(typeof('This is string')); //string

console.log(typeof(2));  //number
console.log(typeof(3.5)); //number

console.log(typeof(true)); //boolean
console.log(typeof(false)); //boolean

console.log(typeof(undefined)); //undefined
console.log(typeof(null)); //null (object)
console.log(typeof([1, 3, 4])); //array (object)

// javascript variable

var a = 5;
console.log(a); //5
console.log(typeof(a)); //number

var b = 'Hi';
var c = true;
var d = undefined;
var e = null;

console.log(b);
console.log(typeof(b));
console.log(c);
console.log(typeof(c));
console.log(d);
console.log(typeof(d));
console.log(e);
console.log(typeof(e));

// var VS let

var myName = 'Khan';
var myName = 'King';
console.log(myName);

let firstName = 'Khishgee';
firstName = 'Nora';

console.log(firstName);

const speedOfLight = 299_792_458;
//speedOfLight = 299_792_459;
console.log(speedOfLight);
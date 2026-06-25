
let check = 'admin';

if(check === 'admin') {
	console.log('Zuvshurltai');
} else if (check === 'user'){
	console.log('Engiin hereglegch')
} else {
	console.log('Tanihgui');
}

let das2 = 'Minecraft';

switch(das2) {
	case 'Minecraft':
		console.log('sulasz	blok togloom');
		break;
	case 'PUBG':
		console.log('Buuddag togloom');
		break;
	case 'FIFA':
		console.log('Hul bumbugiin togloom');
		break;
	default:
		console.log('tanihgui togloom');
}

for(let i = 0; i < 20; i++) {
	if(i % 2 === 0) {
		console.log(`${i} tegsh`);
	} else {
		console.log(`${i} sondgoi`);
	}
}

let names = ['Hongor', 'Sarnai', 'Dorj', 'Oyunaa'];

for (let i = 0; i <names.length; i++) {
	console.log(`${i+1}-${names[i]}`);
}
let sum0 = 0;
let k = 1;
while (k <= 100) {
	sum0 += k;
	k++;
}

console.log(`niit ${sum0}`);

const students = [
	{
	    name: "Бат",
	    age: 20,
	    major: "Computer Science",
	    scores: [85, 90, 78]
	},
	{
	    name: "Sarnai",
	    age: 19,
	    major: "Computer Science",
	    scores: [75, 80, 98]
	},
	{
	    name: "Dorj",
	    age: 30,
	    major: "Art",
	    scores: [95, 70, 88]
	}
	
]

for (let i = 0; i < students.length; i++) {
	if(students[i].age >= 20) console.log(students[i]);
}

for (let i = 0; i < students.length; i++) {
	if(students[i].major === 'Computer Science') {
		console.log(`Computer Scince - ${students[i].name}`);
	} else if (students[i].major === 'Art') {
		console.log(`Art - ${students[i].name`);
	}
}

}
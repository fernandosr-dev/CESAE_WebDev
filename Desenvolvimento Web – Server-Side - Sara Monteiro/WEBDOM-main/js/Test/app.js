const studentGrades = [
    {
        studentName: 'Rita',
        grade: 16,
        nameAndGrade() {
            return `A ${this.studentName} tem nota ${this.grade}`;
        }
    },
    {
        studentName: 'Luís',
        grade: 20,

    },
    {
        studentName: 'João',
        grade: 18,
    },
    {
        studentName: 'André',
        grade: 15,
    },
    {
        studentName: 'Luísa',
        grade: 19,
    }
];

console.log(studentGrades);
console.log(studentGrades[0].nameAndGrade());

//studentGrades[5])
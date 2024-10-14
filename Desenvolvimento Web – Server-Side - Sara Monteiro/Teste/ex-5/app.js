
//5.1. Usando a função forEach dos arrays, itere o array de modo a imprimir na consola o seguinte: (1V)
// A nota de Rita é 16
// A nota de Luís é 20
// A nota de João é 18
// A nota de André é 15
// A nota de Luísa é 19


//Considere que o seguinte é escrito na consola do browser:
//5.2. Qual o valor de studentGrades[5])? (1V)
// Resposta: undefined

//5.3 studentGrades[0].nameAndGrade() é A Rita tem nota 16? (1V)
// Resposta: Sim

const studentGrades = [
    {
        studentName: 'Rita',
        grade: 16,
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
    },
];

// Usando forEach para iterar sobre o array e imprimir na console
studentGrades.forEach(student => {
    console.log('A nota de ' + student.studentName + ' é ' + student.grade);
});



studentGrades[0].nameAndGrade()
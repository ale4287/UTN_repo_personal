//Clase 1 Parte 1
// while
let contador = 0;
while(contador < 3){
     console.log(contador);
     contador++;
     }
console.log("Fin del ciclo while");

//Clase 1 Parte 2
// do while
let conteo = 0;
do{
     console.log(conteo);
     conteo++;
     }while(conteo < 3)
console.log("Fin del ciclo do while");

//Clase 1 Parte 3
//for
for(let contando=0,c=0;contando<3;contando++){
    console.log(contando);
}
console.log("Fin del ciclo for");


//Clase 1 Parte 4
// Palabra reservada break

for(let contando=0;contando<=10;contando++){
    if(contando%2 == 0){
        console.log(contando); // muestreo de todos los pares
        break;
    }
}
console.log("Termina el ciclo al encontrar el primer nro par");


//Clase 1 Parte 5 
// Palabra continue

for(let contando=0;contando<=10;contando++){
    if(contando%2 !== 0){
        continue;  // ir  a la siguiente interaccion
           
    }
    console.log(contando); 
}
console.log("Termina el ciclo ");


//Clase 1 Parte 6 
// Palabra continue y etiquetas
inicio: 
for(let contando=0;contando<=10;contando++){
    if(contando%2 !== 0){
        continue inicio;  // ir  a la siguiente interaccion
           
    }
    console.log(contando); 
}
console.log("Termina el ciclo ");

inicio: 
for(let contando=0;contando<=10;contando++){
    if(contando%2 !== 0){
        break inicio;  // ir  a la siguiente interaccion
    }
    console.log(contando); 
}
console.log("Termina el ciclo ");
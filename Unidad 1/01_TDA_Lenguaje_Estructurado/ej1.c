#include <stdio.h>

typedef struct{
	char nombre[15];
	char apellido[25];
	int  edad;
	char genero;
}Persona;

void beber(Persona persona);
void nacimiento(Persona persona);
void mensajito(Persona persona);

int main(){
	Persona persona;
	printf(" Ingresa tu nombre:\t");
	fgets(persona.nombre, 15, stdin);
	printf(" Ingresa tu apellido:\t");
	fgets(persona.apellido, 25, stdin);
	printf(" Ingresa tu género:\t");
	scanf("%c",&persona.genero);
	printf(" Ingrese la edad:\t");
	scanf("%d",&persona.edad);
	
	beber(persona);
	fflush(stdin);
	nacimiento(persona);
	fflush(stdin);
	mensajito(persona);
	fflush(stdin);
	
}

void beber(Persona persona){
	if(persona.edad >= 18){
		printf("\n %s  la cantidad aproximada de agua que debes beber para tu edad de  %d  es:  2.5 L \n", persona.nombre, persona.edad);
	}
	else{
		printf("\n %s  la cantidad aproximada de agua que debes beber para tu edad de  %d  es:  2L \n", persona.apellido, persona.edad);
	}
}

void nacimiento(Persona persona){
	printf("\n %s %s , este es el año 2022, por lo tanto naciste en el año  %d  \n",persona.nombre,persona.apellido,(2022-persona.edad));
}

void mensajito(Persona persona){        
    if (persona.genero=="F" || persona.genero=="f" ){
    	printf("\n Amiga  %s %s  ten un excelente viernes \n", persona.nombre, persona.apellido);
	}
	if (persona.genero=="M" || persona.genero=="m"){
        printf("\n Amigo  %s %s  ten un excelente viernes \n", persona.nombre, persona.apellido);
	}
	else{
        printf("\n Amigo Marciano ten un excelente viernes \n", persona.nombre, persona.apellido);
	}
}

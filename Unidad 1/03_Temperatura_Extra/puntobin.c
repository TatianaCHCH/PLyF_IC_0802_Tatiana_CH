//		#		3	 	char = 1			byte = 8 bits		#define p7	1<<7
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(){
	/*// 	<< se llama left shifting
	int var1 = 4;			//se encarga de imprimir la reprsentacion en ASCII de la cantidad de binarios MÁS un 0 a la derecha	
	printf("%d ", var1<<1);	// 0000 0100 = 4		más 0	000 01000		que es igual a		1000 = 8		o 		[ 8 = 4 x 2^1	==	print = var x 2^ <<N ]
	
	// 	<< se llama right shifting
	int var2 = 4;			//se encarga de imprimir la reprsentacion en ASCII de la cantidad de binarios MENOS un 0 a la izquierda		
	printf("%d ", var2>>1);	// 0000 0100 = 4		menos 0		_0000 010		que es igual a		10 = 2		o 		[ 8 = 4 / 2^1	==	print = var / 2^ >>N ] */
	
	//PADING buscar
	
	int numero1, numero2, digito, posicion = 0, res1 = 0, dos = 2;
	//unsigned char numero1;
	float res2 = 0, vol = 0;
	int valent[]={1, 2, 4, 8, 16, 32, 64, 128};
	int neg[]={-1, -2, -3, -4};
	float valdec[]={.5, .25, .125, .625};
	
	printf("Ingresa tu numero binario:   ");
	scanf("%i", &numero1);
	
	while(numero1 > 0){
		digito = numero1%10;
		if(digito == 1){
			res1 = res1 + valent[posicion];
		}
		posicion++;
		numero1 = numero1/10;
	}
	printf("\nEl numero entero en b10 es:  %i \n", res1);
	
	digito = 0, posicion = 0;
	/*
	printf("\nIngresa tu numero binario 1011:   ");
	scanf("%i", &numero2);
	
	/*while(numero2 > 0){
		digito = numero2%10;
		if(digito == 1){
			res2 = res2 + valdec[posicion];
		}
		posicion++;
		numero2 = numero2/10;
	}*//*
	while(numero2 > 0){
		digito = numero2%10;
		if(digito == 1){
			//res2 = res2 + valdec[posicion];
			vol = pow(dos, valdec[posicion]);
			res2 = res2 + vol;
		}
		posicion--;
		numero2 = numero2/10;
	}
	
	printf("\nEl numero decimal en b10 es:  %i \n", res2);*/
	
	system("pause");
	//return 0;
}

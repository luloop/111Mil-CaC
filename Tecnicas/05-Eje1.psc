Algoritmo Unidad5Eje1
	Definir cantHoras, canExtras Como Entero
	Definir valorHoras, valorExtra, total Como Real 
	
	valorHora <- 16
	valorExtra <- 20
	
	Escribir "Ingrese la cantidad de horas trabajadas:"
	Leer cantHoras
	
	si cantHoras<=40
		
		total<- cantHoras*valorHora
		Escribir "ustedes deberá cobrar: " total
	SiNo
		canExtras<- cantHoras-40
		total<- (40*valorHora)+canExtras*valorExtra
		Escribir "ustedes deberá cobrar: " total
		
	FinSi
	
FinAlgoritmo

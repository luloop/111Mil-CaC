Algoritmo Unidad5Eje5
	Definir sueldo, horas Como Entero

	Escribir 'Ingrese horas trabajada'
	Leer horas	
	
	si (horas <=40)
		 sueldo <- horas*1		
				
	SiNo
		si (horas >40 y horas <= 48)
			sueldo <- (horas-40)*2+ 40*1
			
		sino 
			sueldo<- 40*1 + 8*2 + (horas-48)*3
		FinSi
	FinSi
	
	Escribir 'El Total a Cobrar es:', sueldo
	
FinAlgoritmo


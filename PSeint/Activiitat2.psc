Algoritmo Activitat2
	totalEuros = 0 
	totalCentims = 0
			
	Escribir 'Quantes monedes tens de 2 centims?'
	Leer monedes2Centims
	Escribir 'Quantes monedes tens de 5 centims?'
	Leer monedes5Centims
	Escribir 'Quantes monedes tens de 10 centims?'
	Leer monedes10Centims
	Escribir 'Quantes monedes tens de 20 centims?'
	Leer monedes20Centims
	Escribir 'Quantes monedes tens de 50 centims?'
	Leer monedes50Centims
	Escribir 'Quantes monedes tens de 1 Euro?'
	Leer monedes1Euro
	Escribir 'Quantes monedes tens de 2 Euros?'
	Leer monedes2Euros
	
	totalCentims <- monedes2Centims * 2 + monedes5Centims * 5 + monedes10Centims * 10 + monedes20Centims * 20 + monedes50Centims * 50
		
	totalEuros <- monedes1Euro + monedes2Euros * 2 + trunc(totalCentims/100)
	
	totalCentims <- totalCentims MOD 100
	
	Escribir 'Tens ', totalEuros, ' Euros i ', totalCentims , ' centims'	
FinAlgoritmo

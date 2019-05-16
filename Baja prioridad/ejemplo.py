#Autor: CASTRO TOCAFFONDI
def sumaDigitos(num): 
    s=0 
    while num>0: 
        s+=num%10 
        num//=10 
    return s 

n = int (input ("Digitar la cantidad de números: ")) #Cantidad de números 
potencia=int(input("Digitar el valor por el cual desea potenciar los números: ")) #Valor al por el cual se potenciará cada número 
sumaD=0 
cont=0 
sumaNum=0 
while n>0: 
    cont+=1 
    num=float(input(f"Número {cont}: ")) 
    sumaNum+=num 
    sumaD+=sumaDigitos(num) 
    potenciacion=num**potencia 
    print(" La potencia del número ",num," es ",potenciacion) 
    n-=1 
print("\nLa suma de los números es: ",sumaNum) 
print("La suma de los dígitos de todos los números es: ",sumaD) 

"""
    Ingreso de datos en Python

 Ejemplo 1:
    "Los datos son:\n\tNombre: {0}\n\tApellidos: {1}".format(n,a)
"""


print("Estamos relizando una prueba para el ciclo while")

# Comentarios de una línea

contador = 1
limite = 3
cadena = "{0}\t{1}\t{2}\n".format("Nombres", "Apellidos", "Edad")
while contador<=limite:
    nombre = input("Ingrese su nombre: \n")
    apellido = input("Ingrese su apellido: \n")
    edad = input("Ingrese su edad: \n")
    cadena = "{0}{1}\t{2}\t\t{3}\n".format(cadena, nombre, apellido, int(edad))
    
    contador = contador + 1 # incremento contador

print(cadena)

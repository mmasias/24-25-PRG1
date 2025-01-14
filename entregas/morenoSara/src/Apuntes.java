//TIPOS DE VARIABLES:
//    INT = Números
//    LONG = entero de mayor tamaño
//    FLOAT = números decimales
//    DOUBLE = números decimales
//    BOOLEAN = TRUE / FALSE
//    CHAR = Caracterres individuales o letras
//OPERADORES:
//    -OPERADORES ARITMÉTICOS:
//        + : suma
//        - : resta
//        * : multiplicación
//        / : división
//        % : porcentaje
//    -OPERADORES RELACIONAL:
//        == : igual
//        != : no igual
//        > : mayor
//        >= : mayor e igual
//        < : menor
//        <= : meno o igual
//    -OPERADORES LÓGICOS:
//        && : AND -> y
//        || : OR -> o
//        !  : NOT -> no
//CONDICIONALES:
//    - IF Y ELSE:
//        if imprescindible y evalua la CONDICIÓN
//        else que hacer si no se cumple, puede o no aparecer
//    - ELSE IF:
//        Encadena instrucciones (varias condicciones)
//        Pueden ser largas
//        Usar sangrias
//    - SWITCH
//        Varias condicciones
//        If anidados
//            Estructura:
//            int dia = 3;
//            String nombreDia;
//                switch (dia)
//                   case 1:
//                    nombreDia = "Lunes";
//                    break;
//                    case 2:
//                    nombreDia = "Martes";
//                    break;
//                    case 3:
//                    nombreDia = "Miércoles";
//                    break;
//                    default:
//                    nombreDia = "Día inválido;
//                
//                
//CICLOS:
//    -FOR:
//        Se conoce de antemano el número de iteraciones
//        Estructura:
//            for (int i=0; > < >= <= ==; i++);
//            for (declarar variable; condición ;implemento)
//    -WHILE:
//        Revisa la condición, si es verdadera ejecuta el código y revisa la condicción
//        Se repite hasta que sea falsa
//        Estructura:
//          While(expresión lógica){
//              instrucción que se repetirá
//          }
//        
//    -DO WHILE:
//          Similar al ciclo while, repite el bucle hasta que la condición sea falsa
//          Se ejecuta minimo una vez,independientemente de la condición (entrada del usuario requerida)
//          Estructua:
//              do{
//                instrucción que se repetirá
//            }While (expresión lógica) -> Haz eso mientras...
// ARREGLOS/ARRAYS:
//  Es una variable que puede almacenar múltiples valores.
//      -Unidimensionales ( vectores): Almacenan conjuntos de datos homogéneos
//          Declara array:tipo_de_variable nombre_del_array [] = new tipo_de_variable[dimensión] / {1,2,3,4,7}
//          nombre_del_array.length -> numero máx de elemntos fila 
//          Posición en un array= nª-1       
//      -Tres dimesiones (matrices)
//          Más de una dimensión filas x columnas
//          Elementos del mismo tipo 
//          Declararlo. tipo_de_dato nombre_matriz = new tipo_de_dato [filas][columnas]
//          número total de elementos = nª filas * nª columnas
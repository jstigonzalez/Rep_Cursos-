package co.edu.poli.RegistroCursos.vista;

import java.util.Scanner;

import co.edu.poli.RegistroCursos.model.*;

public class Cliente  {




    public static void main(String[] args) {

        Estudiante[] estudiantes = new Estudiante[6];


        estudiantes[0] = new Estudiante(1, "Andres", 12, "andres@gmail.com", "15154d");
        estudiantes[1] = new Estudiante(2, "Paula", 12, "paula@gmail.com", "151559l");
        estudiantes[2] = new Estudiante(3, "Andrea", 18, "andrea@gmail.com", "556ñlñ");
        estudiantes[3] = new Estudiante(4, "Nicolas", 14, "nicolas@gmail.com", "151dsac");
        estudiantes[4] = new Estudiante(5, "Sofia", 18, "sofia@gmail.com", "@85sa4z");
        estudiantes[5] = new Estudiante(6, "Johan", 12, "johan@gmail.com", "dsa478c5");


        Instructor[] instructores = new Instructor[3];
        instructores[0] = new Instructor(1,"pedro","andres@gmail.com","fisica");
        instructores[1] = new Instructor(2,"juan","juan@gmail.com","fisica");

        Curso[] cursito = new Curso[3];
        cursito[0] = new Curso(1,"fisica","curso fisica",instructores,estudiantes);
        cursito[1] = new Curso(2,"calculo","curso calculo",instructores,estudiantes);
        
        Registro [] registro = new Registro[2];
        registro[0] = new Registro("12/2/2023","19/3/2023","activo");
        registro[0] = new Registro("15/5/2023","20/6/2023","activo");

        System.out.println("-------Metodo1--------");
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la edad minima:");
        int edadMinima = leer.nextInt();
        System.out.println("Ingresa la edad maxima:");
        int edadMaxima = leer.nextInt();

        System.out.println("Cantidad de estudiantes en el rango:");
        System.out.println(cursito[0].calcularRangoEst(edadMinima,edadMaxima));


        System.out.println("-------metodo2-------");
        System.out.println("Cantidad de estudiantes en el curso");
        System.out.println(cursito[0].calcularRangoEst());
        
        System.out.println("-------Operaciones-----");
        Operacion operacion = new Operacion();
        // Crear un curso
        Curso cursito1 = new Curso(1,"Programacion Java", "Java",instructores,estudiantes);
        Curso cursito2 = new Curso(2,"Base de Datos", "DB",instructores,estudiantes);

        // Añadir dos cursos
        String resultado1 = operacion.create(cursito1);
        String resultado2 = operacion.create(cursito2);

        System.out.println(resultado1); // Debe imprimir "guardado"
        System.out.println(resultado2); // Debe imprimir "guardado"

        // se añade otro curso cuando el cupo está lleno
        Curso cursito3 = new Curso(3,"Algoritmos", "Algos",instructores,estudiantes);
        String resultado3 = operacion.create(cursito3);

        System.out.println(resultado3); // Debe imprimir "el cupo está lleno"

        //Eliminar
        boolean eliminado = operacion.eliminar(2);
        System.out.println(eliminado);

        // método mostrar
        System.out.println("-------Mostrar Curso por ID-------");
        int idCurso = 1; //  ID del curso que se quiere mostrar
        Curso_Main cursoMostrado = operacion.mostrar(idCurso);

        if (cursoMostrado != null) {
            System.out.println(cursoMostrado.toString());
        } else {
            System.out.println("Curso no encontrado");
        }

// ... (código para crear cursos y realizar otras operaciones)
        Curso nuevoCurso = new Curso(3, "pyton", "pyton curso", instructores, estudiantes);
        operacion.actualizar(1, nuevoCurso); // Actualiza el curso con id 1

        // Llamar al método mostrar
        System.out.println("-------Mostrar Curso por ID-------");
        int idCurso1 = 3; // El ID del curso que quieres mostrar
        Curso_Main cursoMostrado1 = operacion.mostrar(idCurso1);

        if (cursoMostrado1 != null) {
            System.out.println(cursoMostrado1.toString());
        } else {
            System.out.println("Curso no encontrado");
        }
        
        System.out.println("--------Descuento-------");
       Mooc Mooc_1 = new Mooc(1,"Quimica","Curso_Quimica",4);
       System.out.println(Mooc_1.descuento(1));
       System.out.println(cursito1.descuento(2));
       
       Funcion funcion = new FuncionIterativa(); 
       Curso_Main curso = new Curso(1, "Programacion Java", "Java", instructores, estudiantes);
       
       String fechaCorte = curso.Fecha_corte(); 
       System.out.println("----------Fecha de corte----------");
       System.out.println(fechaCorte);

       System.out.println("-------------retribución--------");
       Funcion funcion1 = new FuncionIterativa(); // Crear una instancia de Funcion
       int valorParaRetribucion = 5; // Un valor válido para calcular la retribución

       
       double retribucion = cursito[0].calcularRetribucion(funcion1, valorParaRetribucion);
       System.out.println("Retribución: " + retribucion);
       
       System.out.println("----------recursive_tail-----------");
       Funcion funcionFactorial = new FuncionRecursivaCola();
       int resultado = funcionFactorial.calcularFactorial(5);
       System.out.println("El factorial de 5 es: " + resultado);
    }
}

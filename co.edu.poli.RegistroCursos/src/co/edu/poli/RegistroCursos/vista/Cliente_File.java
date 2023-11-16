package co.edu.poli.RegistroCursos.vista;

import java.util.Scanner;

import co.edu.poli.RegistroCursos.model.Accion_File;
import co.edu.poli.RegistroCursos.model.Curso;
import co.edu.poli.RegistroCursos.model.Operacion;


public class Cliente_File {
	public static void main(String[] args) {
		Scanner ConsultarEstudiante = new Scanner (System.in);


		String path = "";
		String file = "my3.txt";
		String s = "";
		Accion_File op = new Accion_File();
		Curso[] cursos = new Curso[5];


		Curso Curso_1 = new Curso(1,"fisica","curso fisica",null,null);
		Curso Curso_2 = new Curso(2,"calulo","curso calculo",null,null);
		Curso Curso_3 = new Curso(3,"ingles","curso ingles",null,null);

		cursos[0] = Curso_1;
		cursos[1] = Curso_2;
		cursos[2] = Curso_3;        

		//Save data text for each object
		/*
        op.createFile(path, file);
        for (int i = 0; i < Curso_t.length; i++) {
            if (!(Curso_t[i]==null))
                s+=Curso_t[i].toString()+"\n";
        }
        op.writeFile(path, file, s);
        System.out.println("Leyendo archivo:");
        System.out.println(op.readFile(path, file));
		 */
		//Save data each object 

		path = "";
		file = "my2.txt";
		System.out.println("Escriba 1 si desea crear un archivo, Escriba 2 si desea eliminar un archivo. Escriba 3 si desea ,modificar un archivo ");
		int indice = ConsultarEstudiante.nextInt();
		if(indice==1) {
			op.serializar(cursos, path, file);

		}
		else if (indice==2) {
			cursos = op.deserializar(path, file);
			Operacion Accion_1 = new Operacion();
			Curso Curso_4 = new Curso(4,"fisica","curso fisica",null,null);

			System.out.println("*** Array Cursos ***");
			Accion_1.create(Curso_3);
			Accion_1.create(Curso_2);
			//Accion_1.create(Curso_4);
			Curso_1.setId(1);
			Curso_2.setId(2);
			Curso_3.setId(3);;
			Curso_4.setId(4);
			Accion_1.eliminar(1);
			Accion_1.create(Curso_4);
			Accion_1.actualizar(5, Curso_4);

			op.serializar(cursos, path, file);

			System.out.println(Accion_1.readall());
		} else {
			cursos = op.deserializar(path, file);
			System.out.println("impresion archivo");
			for (int i = 0; i < cursos.length; i++) {
				System.out.println(cursos[i]);

			}
		}
	}

}

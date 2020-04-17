package com.company;

import com.company.ejercicio1.Cilindro;
import com.company.ejercicio1.Circulo;
import com.company.ejercicio2.Alumno;
import com.company.ejercicio2.Persona;
import com.company.ejercicio2.Staff;
import com.company.ejercicio3.Circulo3;
import com.company.ejercicio3.Cuadrado;
import com.company.ejercicio3.Figura;
import com.company.ejercicio3.Rectangulo;

public class Main {

    public static void main(String[] args) {

        //ejercicio1();
        //ejercicio2();
        ejercicio3();
    }

    public static void ejercicio1(){

        /*1. Vamos a definir el tipo Círculo, que posee un radio cuyo valor por defecto al ser inicializado
        sin valores es 1.0. Además el tipo Círculo posee un atributo color, por defecto rojo,
        un método para calcular el área y otro para imprimir sus características.
            Por otro lado tenemos un tipo Cilindro, que extiende a la clase Circulo, por
        ende se convierte en subclase de Círculo. El Cilindro a diferencia del Círculo posee
        un atributo altura, que también se inicializa en 1.0 cuando no le pasamos un valor a
        su constructor. Y un método para calcular el volumen. Codifique ambas clases y
        realice las siguientes pruebas.
                ● Inicializar un Cilindro y debuguear analizando los constructores a los que va
                llamando para inicializar la cadena de herencia. Imprimir por pantalla, el
                radio del cilindro, la altura, el área de la base y el volumen.
                ● Inicializar un segundo CIlindro esta vez especificando la altura y radio.
                Imprimir por pantalla el radio, la altura, el área de la base y el volumen.
                ● Sobreescribir el método calcular area declarado en Círculo, para que nos
                permita calcular el área del cilindro.
                (2π×radius×height + 2×areaBase)
            Imprimir por pantalla el área y el volumen del cilindro. Vamos a notar que el
        cálculo del volumen difiere, esto es porque nosotros sobreescribimos el método
        calcular area y ahora nos calcula el área de un cilindro. Modificar el método calcular
        volumen en la clase cilindro para que llame al método de la SUPER clase que calcula
        el área.
                ● Modificar el método toString() de la clase cilindro para que imprima por
                pantalla lo siguiente
                Cilindro: subclase de + {toString() de Círculo} +altura= {alturaCilindro};*/

        /*1.A*/
        Cilindro unCilindro = new Cilindro();
        String atributosCilindro= unCilindro.toString();
        System.out.println(atributosCilindro);

        /*1.B*/
        Cilindro otroCilindro = new Cilindro(5,"Azul", 3);
        atributosCilindro=otroCilindro.toString();
        System.out.println("");
        System.out.println(atributosCilindro);

        /*1.C*/
        System.out.println("\nArea Cilindro: " + otroCilindro.getArea());
    }

    public static void ejercicio2(){
        /*2.    Vamos a diseñar un programa que nos permita gestionar el personal que concurre
            a un colegio. Para no hacerlo muy extenso vamos a limitarnos a estudiantes y
            miembros de staff que a diferencia de los estudiantes, estos perciben una
            remuneración. Ambos tipos comparten la característica de Persona que posee los
            atributos de dni, nombre, apellido, email y direccion.
                Por otro lado tenemos al Estudiante que posee las características de
            Persona y las de un estudiante, que en este caso son, año de ingreso, cuota
            mensual y carrera.
                Y finalmente tenemos al miembro de Staff que también es una Persona pero
            con características propias de alguien que trabaja para una institución, por ejemplo
            salario y turno, este puede ser mañana o noche.
            Diagramar el UML identificando superclase y subclases, crear constructores
            necesarios, getters y setters, métodos de ayuda como salario anual y toString para
            facilitar la impresión.
                    ● Inicializar 4 estudiantes diferentes.
                    ● Inicializar 4 miembros de staff con características diferentes.
                    ● Crear un array que permita almacenar juntos los tipos anteriores y
                    almacenar las 8 instancias creadas anteriormente.
                    ● Investigar el uso de la palabra reservada instanceof.
                    ● Recorrer el array y mostrar por pantalla la cantidad de estudiantes y
                    la cantidad de miembros de staff.
                    ● Recorrer el array y sumar el total de ingresos que percibe la
                    institución por parte de la cuota de estudiantes.*/

        Alumno primerAlumno=new Alumno(38406741, "Matias", "Portela","matiasportela94@gmail.com", "25 de Mayo 2575", 2017, "TUP", 2500);
        Alumno segundoAlumno=new Alumno(19257649, "Alberto", "Fernandez","albertito@gmail.com", "Casa Rosada 0", 2018, "Arquitectura", 1575);
        Alumno tercerAlumno=new Alumno(40748946, "Margot", "Robbie","margot@gmail.com", "25 de Mayo 2575", 2015, "Diseno Grafico", 5000);
        Alumno cuartoAlumno=new Alumno(38406741, "Ariel", "Cervigni","arielcervigni@gmail.com", "Buenos Aires 3715", 2017, "TUP", 3200);

        Staff primerStaff=new Staff(25497846, "Robbie", "Williams", "roberto@gmail.com", "Figueroa Alcorta 25 1D", 37500, "Tarde");
        Staff segundoStaff=new Staff(5496793, "Ivan", "Noble", "ivan.noble@gmail.com", "Gascon 5879", 34750, "Tarde");
        Staff tercerStaff=new Staff(20487965, "Yanina", "Latorre", "yani-lato64@gmail.com", "Vidal 897", 41500, "Mañana");
        Staff cuartoStaff=new Staff(27564975, "Patricia", "Sosa", "patoSosa@gmail.com", "Garay 569", 18570, "Mañana");

        Persona [] arrayPersonas= new Persona[8];

        arrayPersonas[0]=primerAlumno;
        arrayPersonas[1]=segundoAlumno;
        arrayPersonas[2]=primerStaff;
        arrayPersonas[3]=tercerAlumno;
        arrayPersonas[4]=segundoStaff;
        arrayPersonas[5]=tercerStaff;
        arrayPersonas[6]=cuartoAlumno;
        arrayPersonas[7]=cuartoStaff;

        int cantidadPersonas=0;
        int cantidadStaff=0;

        for (int i=0; i<arrayPersonas.length; i++){
            if (arrayPersonas[i] instanceof Staff){
                cantidadStaff++;
            }else if (arrayPersonas[i] instanceof Alumno){
                cantidadPersonas++;
            }
        }

        System.out.println("\nCantidad de Empleados: " + cantidadStaff + "\nCantidad de Alumnos: " + cantidadStaff);

        float totalCuotas=0;
        Alumno alumnoAuxiliar;

        for (int i=0; i<arrayPersonas.length;i++){
            if (arrayPersonas[i] instanceof Alumno){
                alumnoAuxiliar = (Alumno) arrayPersonas[i];
                totalCuotas+=alumnoAuxiliar.getCuotaMensual();
            }
        }

        System.out.println("Total de Ingresos por Mes: " + totalCuotas);


    }

    public static void ejercicio3(){
        /*3. Necesitamos crear un programa que nos permita crear diferentes tipos de figuras
            que poseen un color, estas figuras pueden o no estar coloreadas. Además
            necesitamos que las figuras tengan la posibilidad de calcular area y perimetro. Por
            el momento nos piden crear 2 Figuras, Círculo y Rectángulo. ambos deben contar
            con sus respectivas características, ya sea radio, alto, largo, etc. Y deben contar con
            los métodos de cálculo de area y perimetro implementados.
                    ● Considerar si existe la posibilidad de crear un tipo abstracto que
                    defina las características en común y que permita establecer qué
                    métodos son mandatarios para las subclases.
                    ● Los tipos deben contener diferentes constructores, por defecto y que
                    inicialice diferentes atributos.
                    ● Crear diferentes instancias de cada tipo e imprimir sus
                    características.
                    ● Nos piden agregar un nuevo tipo de forma, esta vez es un Cuadrado.
                    Analice dónde es conveniente agregarlo en el árbol de herencia.
                    Teniendo en cuenta evitar la duplicación de código innecesario.*/

        Circulo3 unCirculo=new Circulo3("azul", 5.7);
        Rectangulo unRectangulo= new Rectangulo(null, 1.8, 3.7);

        String atributosCirculo= unCirculo.toString();
        String atributosRectangulo = unRectangulo.toString();

        System.out.println(atributosCirculo + "");
        System.out.println(atributosRectangulo);

        Cuadrado unCuadrado=new Cuadrado("verde", 5);
        String atributosCuadrado=unCuadrado.toString();
        System.out.println(atributosCuadrado);

        Figura [] figura=new Figura[3];
        figura[0]=unCirculo;
        figura[1]=unCuadrado;
        figura[2]=unRectangulo;

        for (Figura f : figura){
            if (f!=null){
                System.out.println("\nEl area de la figura: " + f.getClass().getSimpleName() + " es " + f.getArea());
                System.out.println("El perimetro de la figura: " + f.getClass().getSimpleName() + " es " + f.getPerimetro());
            }
        }


    }

}

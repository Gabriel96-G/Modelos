public class Main {

        public static void main(String[] args){

           // System.out.println("Hola, esta es nuestro primer proyecto de POO :D");//

        //Modelo de un libro

            //String titulo = "Le Rouge et le Noir";
            //String autor = "Stendhal";
            //String genero = "novela";
            //short anioPublicacion = 1830;  // Dato que representa un numero entero en 2 bytes en memoria[-32768, 32767]



            //System.out.println("El libro se titula " + titulo + ", y es un(a)" + genero +
            // " publicado(a) por " + autor + " en " + anioPublicacion + ".");



            // 1. Construccion del objeto
            Libro libro1 = new Libro();

            // 2. Asignacion de los atributos del objeto
            libro1.titulo = "Cien Años de Soledad";
            libro1.autor = "Gabriel Garcia Marquez";
            libro1.genero = "novela";
            libro1.anioPublicacion = 1967;


            //System.out.println("El libro se titula " + libro1.titulo + ", y es un(a) " + libro1.genero +
                    //" publicado(a) por " + libro1.autor + " en " + libro1.anioPublicacion + ".");

            //System.out.println(libro1);


            System.out.println("El libro se titula " + libro1.titulo + ", y es un(a) " + libro1.genero +
                                " publicado(a) por " + libro1.autor + " en " + libro1.anioPublicacion + ".\n");

            System.out.println(libro1);

         // Modelo de un perro

            //String nombrePerro = "Max";
            //String raza = "Golden Retriever";
            // String color = "Dorado";
            // byte edadPerro = 5;
            //double peso = 30.5;


            //System.out.println("El perro se llama " + nombrePerro +
            //  ", es de raza " + raza +
            //  ", tiene " + edadPerro + " años, su color es " + color +
            //   " y pesa " + peso + " kg.");

                // Modelo de una persona

            //  String nombrePersona = "Alejandro";
            //  String apellido = "Medrano";
            //   byte edadPersona = 30;
            //   String nacionalidad = "Costarricense";
            //  double estatura = 1.82;

            //  System.out.println("La persona se llama " + nombrePersona + " " + apellido +
            //           ", tiene " + edadPersona + " años, es " + nacionalidad +
                                //           " y mide " + estatura + " metros.");

                // Modelo de una cuenta de crédito

            //  String titular = "Alejandro Medrano";
            //  String numeroCuenta = "CR-10001";
            //   double limiteCredito = 1500000.00;
            //   double saldoUtilizado = 350000.00;
            //   boolean cuentaActiva = true;

            // System.out.println("La cuenta de crédito pertenece a " + titular +
            //   ", su número de cuenta es " + numeroCuenta +
            //    ", tiene un límite de crédito de ₡" + limiteCredito +
            //    ", un saldo utilizado de ₡" + saldoUtilizado +
            //    " y su estado activo es " + cuentaActiva + ".");


        }

}
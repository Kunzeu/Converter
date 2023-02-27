import javax.swing.JOptionPane;

public class Converter {
	
	public static void Conversion(double montoIngresado) {
		double dolar = 0.0002;
		double euro = 0.0002;
		double libra = 0.059;
		double yen = 0.274;
		double won = 70.47;
		double COP = 4.904;


		String opcion;

		opcion = (JOptionPane.showInputDialog(null, "Elige la moneda a la que deseas convertir  ", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "Selecciona", "COP a Dólar", "COP a Euro", "COP a Libras", "COP a Yen",
						"COP a Won Coreano", "Dólar a COP", "Euro a COP", "Libras a COP" },
				"Selecciona")).toString();

		switch (opcion) {
		case "COP a Dólar":

			JOptionPane.showInternalMessageDialog(null, "$" + (montoIngresado * dolar) + " Dolares");

			break;

		case "COP a Euro":

			JOptionPane.showInternalMessageDialog(null, "€ " + (montoIngresado * euro) + " Euros");

			break;
		case "COP a Libras":

			JOptionPane.showInternalMessageDialog(null, "£ " + montoIngresado * libra + " Euros");

			break;
		case "COP a Yen":

			JOptionPane.showInternalMessageDialog(null, "¥ " + montoIngresado * yen + " Yenes");

			break;
		case "COP a Won Coreano":

			JOptionPane.showInternalMessageDialog(null, "₩ " + montoIngresado * won + " Wons");

			break;
		case "Dólar a COP":

			JOptionPane.showInternalMessageDialog(null, "$ " + montoIngresado * COP + " COPs");

			break;
		case "Euro a COP":

			JOptionPane.showInternalMessageDialog(null, "$ " + montoIngresado * 19.63 + " COPs");

			break;
		case "Libras a COP":

			JOptionPane.showInternalMessageDialog(null, "$ " + montoIngresado * 22.29 + " COPs");

			break;
		default:

			break;

		}

	}

	static void ConversionTem(double temperatura) {

		String opcion;
	
		opcion = (JOptionPane.showInputDialog(null, " ¿Que conversion de temperatura necesitas? ", "Temperatura",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "Selecciona", "Celcius a Fahrenheit", "Celcius a Kelvin", "De Fahrenheit a Celcius",
						"De Fahrenheit a Kelvin", "De Kelvin a Celcius", "De Kelvin a Fahrenheit" },
				"Selecciona")).toString();

		switch (opcion) {
		case "Celcius a Fahrenheit":

			JOptionPane.showInternalMessageDialog(null, ((temperatura * 1.8) + 32) + " °F");

			break;

		case "Celcius a Kelvin":

			JOptionPane.showInternalMessageDialog(null, (temperatura + 273.15) + " °K");

			break;
		case "De Fahrenheit a Celcius":
			JOptionPane.showInternalMessageDialog(null, ((temperatura - 32) / 1.8) + " °C");
			break;

		case "De Fahrenheit a Kelvin":
			JOptionPane.showInternalMessageDialog(null, (((temperatura - 32) * 0.55) + 273.15) + " °K");
			break;

		case "De Kelvin a Celcius":
			JOptionPane.showInternalMessageDialog(null, (temperatura - 273.15) + " °C");

			break;
		case "De Kelvin a Fahrenheit":
			JOptionPane.showInternalMessageDialog(null, (((temperatura - 273.15) * 0.55) + 32) + " °F");
			break;
		default:
			JOptionPane.showInternalMessageDialog(null, "Selecciona un opcion invalida ");
			break;
			
		}
	}
	static void ConversionEdad(int edad) {
	
		JOptionPane.showInternalMessageDialog(null,"Tu edad "+edad+" Años a segundos son "+(edad*3989)+" segundos!!");
	}
	public static void main(String[] args) {
		String[] arreglo = {"Continuar","Salir"};
		String opcion = null;
		String cantidad;
		int continuar;
		double montoIngresado = 0;
		int monto=0;
		try {
			do {
				opcion = (JOptionPane.showInputDialog(null, "Selecciona una opcion de Conversion ", "Conversiones",
						JOptionPane.PLAIN_MESSAGE, null,
						new Object[] { "Selecciona", "Conversion de moneda", "Conversion de temperatura","Conversion de edad a segundos" },
						"Selecciona")).toString();

				switch (opcion) {
				case "Conversion de moneda":
					do {
						cantidad = JOptionPane.showInputDialog("Ingrese el monto a cambiar");
						montoIngresado = Double.parseDouble(cantidad);

					} while (montoIngresado == 0);
					Conversion(montoIngresado);

					break;

				case "Conversin de temperatura":
					cantidad = JOptionPane.showInputDialog("Ingresa los grados a convertir");
					montoIngresado = Double.parseDouble(cantidad);

					ConversionTem(montoIngresado);break;
				case "Conversion de edad a segundos":
					cantidad = JOptionPane.showInputDialog("Ingresa tu  edad");
					monto=Integer.parseInt(cantidad);
					ConversionEdad(monto);
				break;
				case "Selecciona":
						JOptionPane.showInternalMessageDialog(null, "Selecciona un opcion invalida ");
					break;

		
				}
			continuar=JOptionPane.showInternalOptionDialog(null, "¿Deseas continuar?","CONTINUAR...", 0, 0, null, arreglo,"Continuar");
				
			} while (continuar==0);

		} catch (Exception e) {

		} finally {
			JOptionPane.showInternalMessageDialog(null, "Gracias por usar el programa");
		}

	}
}
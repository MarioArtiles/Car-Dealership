package garage;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] models = {"Chevrolet Impala", "Chevrolet Camaro", "Chevrolet Silverado", "Chevrolet Equinox", "Chevrolet Corvette"};
		String[] colors = {"blue", "yellow", "black", "red", "green", "white"};
		String[] modelPackages = {"standard", "premium", "deluxe"};
		
		ArrayList<Car> garage = new ArrayList<Car>();
		
		for (String a: models)
		{
			for (String b: colors)
			{
				for(String c: modelPackages)
				{
					garage.add(new Car(a, b, c));
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Welcome to \"Chevrolet Car Dealership\" car dealership");
		boolean run = true;
		String[] options = {"show all cars", "show all models", "show all cars of a specific model", "remove all cars of a color", "remove all cars of a package", "remove a specific car", "add a specific car"};
		while (run)
		{
			Object menuSelection = JOptionPane.showInputDialog(null, "What would you like to do", "\"Chevrolet Car Dealership\" car dealership", 2, null, options, null);
			if(menuSelection == "show all cars")
			{
				String print = "";
				for(int i = 0; i < garage.size(); i++)
				{
					int a = i+1;
					print += a + ") " + " " + garage.get(i).modelPackage + " " + garage.get(i).model + " ";
					if (i%5 == 0)
					{
						print += "\n";
					}
				}
				JOptionPane.showMessageDialog(null, print);
			}
			else if (menuSelection == "show all models")
			{
				int toyota = 0;
				int tesla = 0;
				int ford = 0;
				int mitsubishi = 0;
				int subaru = 0;
				for (int i = 0; i < garage.size(); i++)
				{
					if (garage.get(i).model == "Chevrolet Impala")
						toyota++;
					else if (garage.get(i).model == "Chevrolet Camaro")
						tesla++;
					else if (garage.get(i).model == "Chevrolet Silverado")
						ford++;
					else if (garage.get(i).model == "Chevrolet Equinox")
						mitsubishi++;
					else if (garage.get(i).model == "Chevrolet Corvette")
						subaru++;		
				}
				JOptionPane.showMessageDialog(null, "There are " + toyota + " Chevrolet Impalas, " + tesla + " Chevrolet Camaros, " + ford + " Chevrolet Silverados, " + mitsubishi + " Chevrolet Equinoxes, and " + subaru + " Chevrolet Corvette.");
			}
			else if (menuSelection == "show all cars of a specific model")
			{
				String print = "";
				String model = (String) JOptionPane.showInputDialog(null, "please select a model", "", 2, null, models, null);
				for (int i = 0; i < garage.size(); i++)
				{
					if(garage.get(i).model.equalsIgnoreCase(model))
					{
						print += garage.get(i).modelPackage + " " + garage.get(i).color + " " + garage.get(i).model + ".\n ";
					}
				}
				JOptionPane.showMessageDialog(null, print);
			}
			else if (menuSelection == "remove all cars of a color")
			{
				int counter = 0;
				String color = (String) JOptionPane.showInputDialog(null, "please select a color", "", 2, null, colors, null);
				for (int i = 0; i < garage.size(); i++)
				{
					if(garage.get(i).color.equalsIgnoreCase(color))
					{
						garage.remove(i);
						i = 0;
						counter++;
					}
				}
				if(color.equalsIgnoreCase("blue"))
				{
					garage.remove(2);
					counter++;
				}
				JOptionPane.showMessageDialog(null, "removed " + counter + " cars");
			}
			else if (menuSelection == "remove all cars of a package")
			{
				int counter = 0;
				String carPackage = (String) JOptionPane.showInputDialog(null, "please select a package", "", 2, null, modelPackages, null);
				for (int i = 0; i < garage.size(); i++)
				{
					if(garage.get(i).modelPackage.equalsIgnoreCase(carPackage))
					{
						garage.remove(i);
						i = 0;
						counter++;
					}
				}
				JOptionPane.showMessageDialog(null, "removed " + counter + " cars");
			}
			else if (menuSelection == "remove a specific car")
			{
				String print = "";
				String model = (String) JOptionPane.showInputDialog(null, "select model", "", 2, null, models, null);
				String carPackage = (String) JOptionPane.showInputDialog(null, " select package", "", 2, null, modelPackages, null);
				for (int i = 0; i < garage.size(); i++)
				{
					if(garage.get(i).model.equalsIgnoreCase(model) && garage.get(i).modelPackage.equalsIgnoreCase(carPackage))
					{
						print += "Removed a " + garage.get(i).modelPackage + " " + garage.get(i).color + " " + garage.get(i).model + ". ";
						garage.remove(i);
						i = garage.size();
					}
				}
				JOptionPane.showMessageDialog(null, print);
			}
			else if (menuSelection == "add a specific car")
			{
				String model = (String) JOptionPane.showInputDialog(null, " select  model", "", 2, null, models, null);
				String color = (String) JOptionPane.showInputDialog(null, " select  color", "", 2, null, colors, null);
				String carPackage = (String) JOptionPane.showInputDialog(null, " select  package", "", 2, null, modelPackages, null);
				garage.add(new Car(model, color, carPackage));
				JOptionPane.showMessageDialog(null, "Added a: " + carPackage + " " + color + " " + model + ". ");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Closing \"Chevrolet Car Dealership\" car dealership" );
				run = false;
			}
		}
	}
}

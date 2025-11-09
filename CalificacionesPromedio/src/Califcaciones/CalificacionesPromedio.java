
	import javax.swing.JOptionPane;

	public class CalificacionesPromedio {
	    public static void main(String[] args) {
	        double[] calificaciones = new double[10];
	        double suma = 0;
	        
	        for (int i = 0; i < 10; i++) {
	            String input = JOptionPane.showInputDialog(
	                null, 
	                "Ingrese la calificación #" + (i + 1) + ":", 
	                "Sistema de Calificaciones", 
	                JOptionPane.QUESTION_MESSAGE
	            );
	            
	            if (input == null) {
	                JOptionPane.showMessageDialog(null, "Operación cancelada");
	                return;
	            }
	            
	            try {
	                double calificacion = Double.parseDouble(input);
	                calificaciones[i] = calificacion;
	                suma += calificacion;
	            } catch (NumberFormatException e) {
	                JOptionPane.showMessageDialog(
	                    null, 
	                    "Error: Por favor ingrese un número válido", 
	                    "Error", 
	                    JOptionPane.ERROR_MESSAGE
	                );
	                i--;
	            }
	        }
	        
	        double promedio = suma / 10;
	        
	        StringBuilder mensaje = new StringBuilder();
	        mensaje.append("=== LISTA DE CALIFICACIONES ===\n");
	        
	        for (int i = 0; i < 10; i++) {
	            mensaje.append("Calificación ").append(i + 1).append(": ").append(calificaciones[i]).append("\n");
	        }
	        
	        mensaje.append("\n=== RESULTADOS ===\n");
	        mensaje.append("Suma total: ").append(suma).append("\n");
	        mensaje.append("Promedio: ").append(String.format("%.2f", promedio));
	        
	        JOptionPane.showMessageDialog(
	            null, 
	            mensaje.toString(), 
	            "Resultados del Sistema de Calificaciones", 
	            JOptionPane.INFORMATION_MESSAGE
	        );
	    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

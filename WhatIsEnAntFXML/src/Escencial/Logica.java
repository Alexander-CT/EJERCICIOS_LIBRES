package Escencial;

/**
 *
 * @author CASTRO TOCAFFONDI Alexander Piero
 */
public class Logica {
    /*String[] animales = {"Oso","Zorro","Rinoceronte"};
	String[] objetos = {"TV","Sofá","PC"};
	*/
	String silueta="";
	String b1, b2, b3, b4, msg, titulo;
	
	
	
    public String getMsg() {
	return msg;
    }
    public void setMsg(String msg) {
	this.msg = msg;
    }
    public String getTitulo() {
    	return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getSilueta() {
	return silueta;
    }
    public void setSilueta(String silueta) {
        this.silueta = silueta;
	}
    public String getB1() {
        return b1;
    }
    public void setB1(String b1) {
        this.b1 = b1;
    }
    public String getB2() {
        return b2;
    }
    public void setB2(String b2) {
        this.b2 = b2;
    }
    public String getB3() {
        return b3;
    }
    public void setB3(String b3) {
        this.b3 = b3;
    }
    public String getB4() {
        return b4;
    }
    public void setB4(String b4) {
        this.b4 = b4;
    }
	/*public String getB5() {
		return b5;
	}
	public void setB5(String b5) {
		this.b5 = b5;
	}*/
	
	
	public void procesoImagen(int sil, int resp) {
		switch (sil) {
			case 1:
				silueta="/Imagenes/tv_sil.png";
	  			//lblJuego.setIcon(new ImageIcon(Game.class.getResource("/Imagenes/tv_sil.png")));
	  			switch (resp){
	  				case 1:
	  					b1="TV";
	  					b2="Radio";
	  					b3="Audifonos";
	  					b4="Gatos";
	  					//b5="Alfombra";
	  					break;
	  				case 2:
	  					b1="Audifonos";
	  					b2="TV";
	  					b3="Radio";
	  					b4="Gato";
	  					//b5="Alfombra";
	  					break;
	  				case 3:
	  					b1="Radio";
	  					b2="Alfombra";
	  					b3="TV";
	  					b4="Gato";
	  					//b5="Audifonos";
	  					break;
	  				case 4:
	  					b1="Gato";
	  					b2="Audifonos";
	  					b3="Radio";
	  					b4="TV";
	  					//b5="Alfombra";
	  					break;
	  				/*case 5:
	  					b1="Alfombra";
	  					b2="Radio";
	  					b3="Audifonos";
	  					b4="Gato";
	  					b5="TV";
	  					break;*/
	  			}
	  			/*btn1.setName("TV");
	    	btn2.setName("Perro");
	    	btn3.setName("Puma");
	    	btn4.setName("Gato");
	    	btn5.setName("Alfombra");*/
	  			break;
			case 2:
				silueta="/Imagenes/rino_sil.png";
				//lblJuego.setIcon(new ImageIcon(Game.class.getResource("/Imagenes/tv_sil.png")));
				switch (resp){
					case 1:
						b1="Rinoceronte";
						b2="pato";
						b3="ganso";
						b4="dinosaurio";
						//b5="name5";
						break;
					case 2:
						b1="Ingeniero";
						b2="Rinoceronte";
						b3="Jirafa";
						b4="Hipopotamo";
						//b5="name5";
						break;
					case 3:
						b1="gusano";
						b2="murcielago";
						b3="Rinoceronte";
						b4="laptop";
						//b5="name5";
						break;
					case 4:
						b1="perro";
						b2="gato";
						b3="troyano";
						b4="Rinoceronte";
						//b5="name5";
						break;
					/*case 5:
						b1="name1";
						b2="name2";
						b3="name3";
						b4="name4";
						b5="Rinoceronte";
						break;*/
				}
				
				/*lblJuego.setIcon(new ImageIcon(Game.class.getResource("/Imagenes/rino_sil.png")));
	  			btn1.setName("name1");
	  			btn2.setName("Rinocernonte");
	  			btn3.setName("name3");
	  			btn4.setName("name4");
	  			btn5.setName("name5");
	  			break;*/
				break;
			case 3:
				silueta="/Imagenes/sofa_sil.png";
				//lblJuego.setIcon(new ImageIcon(Game.class.getResource("/Imagenes/tv_sil.png")));
				switch (resp){
					case 1:
						b1="Sofá";
						b2="silla";
						b3="mesa";
						b4="carpeta";
						//b5="name5";
						break;
					case 2:
						b1="pupitre";
						b2="Sofá";
						b3="Proyector";
						b4="Plumon";
						//b5="name5";
						break;
					case 3:
						b1="Analista";
	  					b2="Silla";
	  					b3="Sofá";
	  					b4="Mesa";
	  					//b5="name5";
	  					break;
					case 4:
						b1="Mesa";
	  					b2="Martillo";
	  					b3="Destornillador";
	  					b4="Sofá";
	  					//b5="name5";
	  					break;
					/*case 5:
						b1="name1";
						b2="name2";
						b3="name3";
						b4="name4";
						//b5="Sofá";
						break;*/
				}
				/*lblJuego.setIcon(new ImageIcon(Game.class.getResource("/Imagenes/sofa_sil.png")));
	  			btn1.setName("name1");
	  			btn2.setName("name2");
	  			btn3.setName("Sofa");
	    		btn4.setName("name4");
	    		btn5.setName("name5");*/
				break;
			case 4:
				silueta="/Imagenes/pc_sil.png";
				//lblJuego.setIcon(new ImageIcon(Game.class.getResource("/Imagenes/tv_sil.png")));
				switch (resp){
					case 1:
						b1="PC";
						b2="usb";
						b3="cargador";
						b4="borrador";
						//b5="name5";
						break;
					case 2:
						b1="laptop";
						b2="PC";
						b3="usb";
						b4="teclado";
						//b5="name5";
						break;
					case 3:
						b1="teclado";
						b2="laptop";
						b3="PC";
						b4="usb";
						//b5="name5";
						break;
					case 4:
						b1="usb";
						b2="teclado";
						b3="laptop";
						b4="PC";
						//b5="name5";
						break;
					/*case 5:
						b1="name1";
	  					b2="name2";
	  					b3="name3";
	  					b4="name4";
	  					b5="PC";
	  					break;*/
				}
				/*lblJuego.setIcon(new ImageIcon(Game.class.getResource("/Imagenes/pc_sil.png")));
	  			btn1.setName("name1");
	  			btn2.setName("name2");
	    		btn3.setName("name3");
	    		btn4.setName("PC");
	    		btn5.setName("name5");*/
				break;
			case 5:
				silueta="/Imagenes/oso_sil.png";
				//lblJuego.setIcon(new ImageIcon(Game.class.getResource("/Imagenes/tv_sil.png")));
				switch (resp){
	  				case 1:
	  					b1="Oso";
	  					b2="Gorila";
	  					b3="Pulpo";
	  					b4="Calamar";
	  					//b5="name5";
	  					break;
	  				case 2:
	  					b1="Pez";
	  					b2="Oso";
	  					b3="Conejo";
	  					b4="Loro";
	  					//b5="name5";
	  					break;
	  				case 3:
	  					b1="Gorila";
	  					b2="Mono";
	  					b3="Oso";
	  					b4="Pie Grande";
	  					//b5="name5";
	  					break;
	  				case 4:
	  					b1="Lobo";
	  					b2="Perro";
	  					b3="Gorila";
	  					b4="Oso";
	  					//b5="name5";
	  					break;
	  				/*case 5:
	  					b1="name1";
	  					b2="name2";
	  					b3="name3";
	  					b4="name4";
	  					b5="Oso";
	  					break;*/
				}
				/*lblJuego.setIcon(new ImageIcon(Game.class.getResource("/Imagenes/oso_sil.png")));
	  			btn1.setName("Puma");
	  			btn2.setName("name2");
	  			btn3.setName("name3");
	  			btn4.setName("Perro");
	  			btn5.setName("Oso");*/
				break;
			case 6:
				silueta="/Imagenes/zorro_sil.png";
				//lblJuego.setIcon(new ImageIcon(Game.class.getResource("/Imagenes/tv_sil.png")));
				switch (resp){
					case 1:
						b1="Zorro";
						b2="gato";
						b3="Lobo";
						b4="Perro";
						//b5="name5";
						break;
					case 2:
						b1="Lobo";
						b2="Zorro";
////						
                                                b3="Perro";
						b4="hiena";
						//b5="name5";
						break;
					case 3:
						b1="name1";
	  					b2="Lobo";
	  					b3="Zorro";
	  					b4="Perro";
	  					//b5="name5";
	  					break;
					case 4:
						b1="Perro";
						b2="Lobo";
						b3="Hiena";
						b4="Zorro";
						//b5="name5";
						break;
					/*case 5:
						b1="name1";
						b2="name2";
						b3="name3";
						b4="name4";
						b5="Zorro";
						break;*/
				}
				/*lblJuego.setIcon(new ImageIcon(Game.class.getResource("/Imagenes/zorro_sil.png")));
	  			btn1.setName("name1");
	  			btn2.setName("name2");
	  			btn3.setName("name3");
	  			btn4.setName("name4");
	  			btn5.setName("Zorro");*/
				break;
		}
	}
	
	public void procesoBoton(String respName) {
		
		switch (respName) {
			case "Oso":
				silueta="/Imagenes/oso.png";
				msg="Correcto!\nEfectivamente la respuesta correcta es "+respName;
				titulo="RESPUESTA CORRECTA";
				//JOptionPane.showMessageDialog(null, "Correcto!\nEfectivamente la respuesta correcta es "+respName,"RESPUESTA_CORRECTA",JOptionPane.INFORMATION_MESSAGE);
				break;
			case "PC":
				silueta="/Imagenes/pc.png";
				msg="Correcto!\nEfectivamente la respuesta correcta es "+respName;
				titulo="RESPUESTA CORRECTA";
				//JOptionPane.showMessageDialog(null, "Correcto!\nEfectivamente la respuesta correcta es "+respName,"RESPUESTA_CORRECTA",JOptionPane.INFORMATION_MESSAGE);
				break;
			case "Zorro":
				silueta="/Imagenes/zorro.png";
				msg="Correcto!\nEfectivamente la respuesta correcta es "+respName;
				titulo="RESPUESTA CORRECTA";
				//JOptionPane.showMessageDialog(null, "Correcto!\nEfectivamente la respuesta correcta es "+respName,"RESPUESTA_CORRECTA",JOptionPane.INFORMATION_MESSAGE);
				break;
			case "Rinoceronte":
				silueta="/Imagenes/rino.png";
				msg="Correcto!\nEfectivamente la respuesta correcta es "+respName;
				titulo="RESPUESTA CORRECTA";
				//JOptionPane.showMessageDialog(null, "Correcto!\nEfectivamente la respuesta correcta es "+respName,"RESPUESTA_CORRECTA",JOptionPane.INFORMATION_MESSAGE);
				break;
			case "TV":
				silueta="/Imagenes/tv.png";
				msg="Correcto!\nEfectivamente la respuesta correcta es "+respName;
				titulo="RESPUESTA CORRECTA";
				//JOptionPane.showMessageDialog(null, "Correcto!\nEfectivamente la respuesta correcta es "+respName,"RESPUESTA_CORRECTA",JOptionPane.INFORMATION_MESSAGE);
				break;
			case "Sofá":
				silueta="/Imagenes/sofa.png";
				msg="Correcto!\nEfectivamente la respuesta correcta es "+respName;
				titulo="RESPUESTA CORRECTA";
				//JOptionPane.showMessageDialog(null, "Correcto!\nEfectivamente la respuesta correcta es "+respName,"RESPUESTA_CORRECTA",JOptionPane.INFORMATION_MESSAGE);
				break;
			default:
				msg="Incorrecto\nIntenta otra vez";
				titulo="RESPUESTA INCORRECTA";
		}
	}
}

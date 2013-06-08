package Jframes;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;


public class SimpleFrame  extends JFrame{
	public static int DEFAULT_WIDTH=300;
	public static int DEFAULT_HEIGHT=200;	
	public SimpleFrame()

	{
		/*
		 * Para descobrir  o tamanho da tela, use os seguintes passos. Chame o metodo estatico getDefaultToolkit da classe ToolKit para obter o 
		 * objeto Toolkit (a classe ToolKit eh um campo de despejo para uma serie de metodos que fazem interfaca com o sistema de janelas 
		 * nativo). Em seguida, chame o metodo getScreenSize, que retorna o tamanho da tela como um objeto Dimension. O objeto Dimension arma
		 * zena simultaneamente uma largura (width) e uma altura (height), mas variaveis de instanciaas publicas
		 */
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		
		DEFAULT_WIDTH = screenSize.width;
		DEFAULT_HEIGHT= screenSize.height;
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
	}
	
	
}

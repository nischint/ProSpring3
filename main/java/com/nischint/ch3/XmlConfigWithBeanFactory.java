package com.nischint.ch3;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

public class XmlConfigWithBeanFactory {

	public static void main(String[] args) {
		DefaultListableBeanFactory bf = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(bf);
		rdr.loadBeanDefinitions(new FileSystemResource("src/main/java/com/nischint/ch3/xmlBeanDefs.xml"));
		
		Oracle oracle = (Oracle) bf.getBean("oracle", com.nischint.ch3.BookWormOracle.class);
		System.out.println(oracle.defineMeaningOfLife());
	}

}

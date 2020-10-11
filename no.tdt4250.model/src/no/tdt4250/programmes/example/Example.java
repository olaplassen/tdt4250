package no.tdt4250.programmes.example;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import tdt4250.programmes.ProgrammesPackage;

public class Example {
	
	public static void main(String[] args) {
		ResourceSet reset = new ResourceSetImpl();
		reset.getPackageRegistry().put(ProgrammesPackage.eNS_URI, ProgrammesPackage.eINSTANCE);
		reset.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = reset.getResource(URI.createURI(Example.class.getResource("School.xmi").toString()), true);
		
		TreeIterator<EObject> allContents = resource.getAllContents();
		while (allContents.hasNext()) {
			EObject eObject = allContents.next();
			System.out.println(eObject);
		}
		
//		for (EObject eObject : resource.getContents()) {
//			System.out.println(eObject);
//			System.out.println();
//		}
	}

}

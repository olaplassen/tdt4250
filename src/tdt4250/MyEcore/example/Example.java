package tdt4250.MyEcore.example;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import tdt4250.MyEcore.MyEcorePackage;

public class Example {

	public static void main(String[] args) {
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(MyEcorePackage.eNS_URI, MyEcorePackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = resSet.getResource(URI.createURI(Example.class.getResource("School_2.xmi").toString()), true);
		TreeIterator<EObject> allContents = resource.getAllContents();
		while (allContents.hasNext()) {
			EObject eObject = allContents.next();
			System.out.println(eObject);
		}
	}

}

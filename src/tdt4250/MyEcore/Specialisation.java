/**
 */
package tdt4250.MyEcore;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.Specialisation#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link tdt4250.MyEcore.Specialisation#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.MyEcore.Specialisation#getNewSpecialication <em>New Specialication</em>}</li>
 * </ul>
 *
 * @see tdt4250.MyEcore.MyEcorePackage#getSpecialisation()
 * @model
 * @generated
 */
public interface Specialisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.MyEcore.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see tdt4250.MyEcore.MyEcorePackage#getSpecialisation_Semesters()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.MyEcore.MyEcorePackage#getSpecialisation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.Specialisation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>New Specialication</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.MyEcore.Specialisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Specialication</em>' containment reference list.
	 * @see tdt4250.MyEcore.MyEcorePackage#getSpecialisation_NewSpecialication()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialisation> getNewSpecialication();

} // Specialisation

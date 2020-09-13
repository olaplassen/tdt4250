/**
 */
package tdt4250.MyEcore;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.Year#getYear <em>Year</em>}</li>
 *   <li>{@link tdt4250.MyEcore.Year#getSpecilisations <em>Specilisations</em>}</li>
 *   <li>{@link tdt4250.MyEcore.Year#getSemsters <em>Semsters</em>}</li>
 * </ul>
 *
 * @see tdt4250.MyEcore.MyEcorePackage#getYear()
 * @model
 * @generated
 */
public interface Year extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see tdt4250.MyEcore.MyEcorePackage#getYear_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.Year#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Specilisations</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.MyEcore.Specialisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specilisations</em>' containment reference list.
	 * @see tdt4250.MyEcore.MyEcorePackage#getYear_Specilisations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialisation> getSpecilisations();

	/**
	 * Returns the value of the '<em><b>Semsters</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.MyEcore.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semsters</em>' containment reference list.
	 * @see tdt4250.MyEcore.MyEcorePackage#getYear_Semsters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester> getSemsters();

} // Year

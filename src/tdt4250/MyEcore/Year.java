/**
 */
package tdt4250.MyEcore;

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
 *   <li>{@link tdt4250.MyEcore.Year#getOrdinaryPrograms <em>Ordinary Programs</em>}</li>
 *   <li>{@link tdt4250.MyEcore.Year#getProgramsWithSpecialisation <em>Programs With Specialisation</em>}</li>
 *   <li>{@link tdt4250.MyEcore.Year#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @see tdt4250.MyEcore.MyEcorePackage#getYear()
 * @model
 * @generated
 */
public interface Year extends EObject {
	/**
	 * Returns the value of the '<em><b>Ordinary Programs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordinary Programs</em>' containment reference.
	 * @see #setOrdinaryPrograms(OrdinaryProgram)
	 * @see tdt4250.MyEcore.MyEcorePackage#getYear_OrdinaryPrograms()
	 * @model containment="true"
	 * @generated
	 */
	OrdinaryProgram getOrdinaryPrograms();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.Year#getOrdinaryPrograms <em>Ordinary Programs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordinary Programs</em>' containment reference.
	 * @see #getOrdinaryPrograms()
	 * @generated
	 */
	void setOrdinaryPrograms(OrdinaryProgram value);

	/**
	 * Returns the value of the '<em><b>Programs With Specialisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs With Specialisation</em>' containment reference.
	 * @see #setProgramsWithSpecialisation(ProgramWithSpecialisation)
	 * @see tdt4250.MyEcore.MyEcorePackage#getYear_ProgramsWithSpecialisation()
	 * @model containment="true"
	 * @generated
	 */
	ProgramWithSpecialisation getProgramsWithSpecialisation();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.Year#getProgramsWithSpecialisation <em>Programs With Specialisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programs With Specialisation</em>' containment reference.
	 * @see #getProgramsWithSpecialisation()
	 * @generated
	 */
	void setProgramsWithSpecialisation(ProgramWithSpecialisation value);

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

} // Year

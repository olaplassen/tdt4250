/**
 */
package tdt4250.MyEcore;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program With Specialisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.ProgramWithSpecialisation#getProgramSpecialicationYear <em>Program Specialication Year</em>}</li>
 *   <li>{@link tdt4250.MyEcore.ProgramWithSpecialisation#getSchool <em>School</em>}</li>
 * </ul>
 *
 * @see tdt4250.MyEcore.MyEcorePackage#getProgramWithSpecialisation()
 * @model
 * @generated
 */
public interface ProgramWithSpecialisation extends Program {
	/**
	 * Returns the value of the '<em><b>Program Specialication Year</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.MyEcore.Year}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Specialication Year</em>' containment reference list.
	 * @see tdt4250.MyEcore.MyEcorePackage#getProgramWithSpecialisation_ProgramSpecialicationYear()
	 * @model containment="true"
	 * @generated
	 */
	EList<Year> getProgramSpecialicationYear();

	/**
	 * Returns the value of the '<em><b>School</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.MyEcore.School#getProgramsWithSpecialications <em>Programs With Specialications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School</em>' container reference.
	 * @see #setSchool(School)
	 * @see tdt4250.MyEcore.MyEcorePackage#getProgramWithSpecialisation_School()
	 * @see tdt4250.MyEcore.School#getProgramsWithSpecialications
	 * @model opposite="programsWithSpecialications" transient="false"
	 * @generated
	 */
	School getSchool();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.ProgramWithSpecialisation#getSchool <em>School</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>School</em>' container reference.
	 * @see #getSchool()
	 * @generated
	 */
	void setSchool(School value);

} // ProgramWithSpecialisation

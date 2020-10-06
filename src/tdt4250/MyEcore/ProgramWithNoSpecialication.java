/**
 */
package tdt4250.MyEcore;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program With No Specialication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.ProgramWithNoSpecialication#getProgramYear <em>Program Year</em>}</li>
 *   <li>{@link tdt4250.MyEcore.ProgramWithNoSpecialication#getSchool <em>School</em>}</li>
 * </ul>
 *
 * @see tdt4250.MyEcore.MyEcorePackage#getProgramWithNoSpecialication()
 * @model
 * @generated
 */
public interface ProgramWithNoSpecialication extends Program {
	/**
	 * Returns the value of the '<em><b>Program Year</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.MyEcore.Year}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Year</em>' containment reference list.
	 * @see tdt4250.MyEcore.MyEcorePackage#getProgramWithNoSpecialication_ProgramYear()
	 * @model containment="true"
	 * @generated
	 */
	EList<Year> getProgramYear();

	/**
	 * Returns the value of the '<em><b>School</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.MyEcore.School#getProgramsWithNoSpecialication <em>Programs With No Specialication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School</em>' container reference.
	 * @see #setSchool(School)
	 * @see tdt4250.MyEcore.MyEcorePackage#getProgramWithNoSpecialication_School()
	 * @see tdt4250.MyEcore.School#getProgramsWithNoSpecialication
	 * @model opposite="programsWithNoSpecialication" transient="false"
	 * @generated
	 */
	School getSchool();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.ProgramWithNoSpecialication#getSchool <em>School</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>School</em>' container reference.
	 * @see #getSchool()
	 * @generated
	 */
	void setSchool(School value);

} // ProgramWithNoSpecialication

/**
 */
package tdt4250.MyEcore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>School</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.School#getProgramsWithNoSpecialication <em>Programs With No Specialication</em>}</li>
 *   <li>{@link tdt4250.MyEcore.School#getSchoolName <em>School Name</em>}</li>
 *   <li>{@link tdt4250.MyEcore.School#getStudents <em>Students</em>}</li>
 *   <li>{@link tdt4250.MyEcore.School#getProgramsWithSpecialications <em>Programs With Specialications</em>}</li>
 * </ul>
 *
 * @see tdt4250.MyEcore.MyEcorePackage#getSchool()
 * @model
 * @generated
 */
public interface School extends EObject {
	/**
	 * Returns the value of the '<em><b>Programs With No Specialication</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.MyEcore.ProgramWithNoSpecialication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs With No Specialication</em>' containment reference list.
	 * @see tdt4250.MyEcore.MyEcorePackage#getSchool_ProgramsWithNoSpecialication()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProgramWithNoSpecialication> getProgramsWithNoSpecialication();

	/**
	 * Returns the value of the '<em><b>School Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School Name</em>' attribute.
	 * @see #setSchoolName(String)
	 * @see tdt4250.MyEcore.MyEcorePackage#getSchool_SchoolName()
	 * @model
	 * @generated
	 */
	String getSchoolName();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.School#getSchoolName <em>School Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>School Name</em>' attribute.
	 * @see #getSchoolName()
	 * @generated
	 */
	void setSchoolName(String value);

	/**
	 * Returns the value of the '<em><b>Students</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.MyEcore.Student}.
	 * It is bidirectional and its opposite is '{@link tdt4250.MyEcore.Student#getSchool <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' containment reference list.
	 * @see tdt4250.MyEcore.MyEcorePackage#getSchool_Students()
	 * @see tdt4250.MyEcore.Student#getSchool
	 * @model opposite="school" containment="true"
	 * @generated
	 */
	EList<Student> getStudents();

	/**
	 * Returns the value of the '<em><b>Programs With Specialications</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.MyEcore.ProgramWithSpecialisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs With Specialications</em>' containment reference list.
	 * @see tdt4250.MyEcore.MyEcorePackage#getSchool_ProgramsWithSpecialications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProgramWithSpecialisation> getProgramsWithSpecialications();

} // School

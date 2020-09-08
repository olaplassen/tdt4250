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
 *   <li>{@link tdt4250.MyEcore.School#getPrograms <em>Programs</em>}</li>
 *   <li>{@link tdt4250.MyEcore.School#getSchoolName <em>School Name</em>}</li>
 *   <li>{@link tdt4250.MyEcore.School#getStudents <em>Students</em>}</li>
 * </ul>
 *
 * @see tdt4250.MyEcore.MyEcorePackage#getSchool()
 * @model
 * @generated
 */
public interface School extends EObject {
	/**
	 * Returns the value of the '<em><b>Programs</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.MyEcore.Program}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs</em>' containment reference list.
	 * @see tdt4250.MyEcore.MyEcorePackage#getSchool_Programs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Program> getPrograms();

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
	 * Returns the value of the '<em><b>Students</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.MyEcore.Student#getSchool <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' containment reference.
	 * @see #setStudents(Student)
	 * @see tdt4250.MyEcore.MyEcorePackage#getSchool_Students()
	 * @see tdt4250.MyEcore.Student#getSchool
	 * @model opposite="school" containment="true"
	 * @generated
	 */
	Student getStudents();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.School#getStudents <em>Students</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Students</em>' containment reference.
	 * @see #getStudents()
	 * @generated
	 */
	void setStudents(Student value);

} // School

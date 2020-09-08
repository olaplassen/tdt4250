/**
 */
package tdt4250.MyEcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selected Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.SelectedSemester#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @see tdt4250.MyEcore.MyEcorePackage#getSelectedSemester()
 * @model
 * @generated
 */
public interface SelectedSemester extends EObject {
	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference.
	 * @see #setSemesters(Semester)
	 * @see tdt4250.MyEcore.MyEcorePackage#getSelectedSemester_Semesters()
	 * @model containment="true"
	 * @generated
	 */
	Semester getSemesters();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.SelectedSemester#getSemesters <em>Semesters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semesters</em>' containment reference.
	 * @see #getSemesters()
	 * @generated
	 */
	void setSemesters(Semester value);

} // SelectedSemester

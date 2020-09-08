/**
 */
package tdt4250.MyEcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.Semester#getElectiveCourses <em>Elective Courses</em>}</li>
 *   <li>{@link tdt4250.MyEcore.Semester#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 *   <li>{@link tdt4250.MyEcore.Semester#getSemesterCreditRequirements <em>Semester Credit Requirements</em>}</li>
 * </ul>
 *
 * @see tdt4250.MyEcore.MyEcorePackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasEnoughCredits'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Elective Courses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elective Courses</em>' containment reference.
	 * @see #setElectiveCourses(Course)
	 * @see tdt4250.MyEcore.MyEcorePackage#getSemester_ElectiveCourses()
	 * @model containment="true"
	 * @generated
	 */
	Course getElectiveCourses();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.Semester#getElectiveCourses <em>Elective Courses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elective Courses</em>' containment reference.
	 * @see #getElectiveCourses()
	 * @generated
	 */
	void setElectiveCourses(Course value);

	/**
	 * Returns the value of the '<em><b>Mandatory Courses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Courses</em>' containment reference.
	 * @see #setMandatoryCourses(Course)
	 * @see tdt4250.MyEcore.MyEcorePackage#getSemester_MandatoryCourses()
	 * @model containment="true"
	 * @generated
	 */
	Course getMandatoryCourses();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.Semester#getMandatoryCourses <em>Mandatory Courses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory Courses</em>' containment reference.
	 * @see #getMandatoryCourses()
	 * @generated
	 */
	void setMandatoryCourses(Course value);

	/**
	 * Returns the value of the '<em><b>Semester Credit Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Credit Requirements</em>' attribute.
	 * @see #setSemesterCreditRequirements(float)
	 * @see tdt4250.MyEcore.MyEcorePackage#getSemester_SemesterCreditRequirements()
	 * @model
	 * @generated
	 */
	float getSemesterCreditRequirements();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.Semester#getSemesterCreditRequirements <em>Semester Credit Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Credit Requirements</em>' attribute.
	 * @see #getSemesterCreditRequirements()
	 * @generated
	 */
	void setSemesterCreditRequirements(float value);

} // Semester

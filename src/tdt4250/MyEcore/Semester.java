/**
 */
package tdt4250.MyEcore;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link tdt4250.MyEcore.Semester#getYear <em>Year</em>}</li>
 *   <li>{@link tdt4250.MyEcore.Semester#getElectiveCourses <em>Elective Courses</em>}</li>
 *   <li>{@link tdt4250.MyEcore.Semester#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 *   <li>{@link tdt4250.MyEcore.Semester#getSemesterKind <em>Semester Kind</em>}</li>
 * </ul>
 *
 * @see tdt4250.MyEcore.MyEcorePackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='semesterHasEnoughCredit'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 semesterHasEnoughCredit='((self.electiveCourses-&gt;collect(e | e.credit)-&gt;sum()) + (self.mandatoryCourses-&gt;collect(e | e.credit)-&gt;sum())) &gt;=30.0'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see tdt4250.MyEcore.MyEcorePackage#getSemester_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.Semester#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Elective Courses</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.MyEcore.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elective Courses</em>' containment reference list.
	 * @see tdt4250.MyEcore.MyEcorePackage#getSemester_ElectiveCourses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getElectiveCourses();

	/**
	 * Returns the value of the '<em><b>Mandatory Courses</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.MyEcore.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Courses</em>' containment reference list.
	 * @see tdt4250.MyEcore.MyEcorePackage#getSemester_MandatoryCourses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getMandatoryCourses();

	/**
	 * Returns the value of the '<em><b>Semester Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.MyEcore.SemesterKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Kind</em>' attribute.
	 * @see tdt4250.MyEcore.SemesterKind
	 * @see #setSemesterKind(SemesterKind)
	 * @see tdt4250.MyEcore.MyEcorePackage#getSemester_SemesterKind()
	 * @model
	 * @generated
	 */
	SemesterKind getSemesterKind();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.Semester#getSemesterKind <em>Semester Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Kind</em>' attribute.
	 * @see tdt4250.MyEcore.SemesterKind
	 * @see #getSemesterKind()
	 * @generated
	 */
	void setSemesterKind(SemesterKind value);

} // Semester

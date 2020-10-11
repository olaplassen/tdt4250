/**
 */
package tdt4250.programmes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.programmes.Course#getCode <em>Code</em>}</li>
 *   <li>{@link tdt4250.programmes.Course#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.programmes.Course#getCourseSemesterType <em>Course Semester Type</em>}</li>
 *   <li>{@link tdt4250.programmes.Course#getCredits <em>Credits</em>}</li>
 * </ul>
 *
 * @see tdt4250.programmes.ProgrammesPackage#getCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='correctCrtedit hasCredit'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 hasCredit='self.credits != null'"
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see tdt4250.programmes.ProgrammesPackage#getCourse_Code()
	 * @model dataType="tdt4250.programmes.CourseCode"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link tdt4250.programmes.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.programmes.ProgrammesPackage#getCourse_Name()
	 * @model dataType="tdt4250.programmes.Name"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.programmes.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Course Semester Type</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.programmes.SemesterKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Semester Type</em>' attribute.
	 * @see tdt4250.programmes.SemesterKind
	 * @see #setCourseSemesterType(SemesterKind)
	 * @see tdt4250.programmes.ProgrammesPackage#getCourse_CourseSemesterType()
	 * @model
	 * @generated
	 */
	SemesterKind getCourseSemesterType();

	/**
	 * Sets the value of the '{@link tdt4250.programmes.Course#getCourseSemesterType <em>Course Semester Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Semester Type</em>' attribute.
	 * @see tdt4250.programmes.SemesterKind
	 * @see #getCourseSemesterType()
	 * @generated
	 */
	void setCourseSemesterType(SemesterKind value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(float)
	 * @see tdt4250.programmes.ProgrammesPackage#getCourse_Credits()
	 * @model
	 * @generated
	 */
	float getCredits();

	/**
	 * Sets the value of the '{@link tdt4250.programmes.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(float value);

} // Course

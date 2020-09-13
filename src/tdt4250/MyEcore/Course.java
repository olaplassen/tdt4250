/**
 */
package tdt4250.MyEcore;

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
 *   <li>{@link tdt4250.MyEcore.Course#getCode <em>Code</em>}</li>
 *   <li>{@link tdt4250.MyEcore.Course#getCredit <em>Credit</em>}</li>
 *   <li>{@link tdt4250.MyEcore.Course#getLevel <em>Level</em>}</li>
 *   <li>{@link tdt4250.MyEcore.Course#getFallOrAutumnCourse <em>Fall Or Autumn Course</em>}</li>
 * </ul>
 *
 * @see tdt4250.MyEcore.MyEcorePackage#getCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='correctCredit'"
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see tdt4250.MyEcore.MyEcorePackage#getCourse_Code()
	 * @model dataType="tdt4250.MyEcore.CourseCode"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit</em>' attribute.
	 * @see #setCredit(float)
	 * @see tdt4250.MyEcore.MyEcorePackage#getCourse_Credit()
	 * @model
	 * @generated
	 */
	float getCredit();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.Course#getCredit <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit</em>' attribute.
	 * @see #getCredit()
	 * @generated
	 */
	void setCredit(float value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(String)
	 * @see tdt4250.MyEcore.MyEcorePackage#getCourse_Level()
	 * @model
	 * @generated
	 */
	String getLevel();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.Course#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(String value);

	/**
	 * Returns the value of the '<em><b>Fall Or Autumn Course</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.MyEcore.SemesterKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fall Or Autumn Course</em>' attribute.
	 * @see tdt4250.MyEcore.SemesterKind
	 * @see #setFallOrAutumnCourse(SemesterKind)
	 * @see tdt4250.MyEcore.MyEcorePackage#getCourse_FallOrAutumnCourse()
	 * @model
	 * @generated
	 */
	SemesterKind getFallOrAutumnCourse();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.Course#getFallOrAutumnCourse <em>Fall Or Autumn Course</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fall Or Autumn Course</em>' attribute.
	 * @see tdt4250.MyEcore.SemesterKind
	 * @see #getFallOrAutumnCourse()
	 * @generated
	 */
	void setFallOrAutumnCourse(SemesterKind value);

} // Course

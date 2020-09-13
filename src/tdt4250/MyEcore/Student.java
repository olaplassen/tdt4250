/**
 */
package tdt4250.MyEcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.Student#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.MyEcore.Student#getFirstName <em>First Name</em>}</li>
 *   <li>{@link tdt4250.MyEcore.Student#getLastName <em>Last Name</em>}</li>
 *   <li>{@link tdt4250.MyEcore.Student#getEmail <em>Email</em>}</li>
 *   <li>{@link tdt4250.MyEcore.Student#getId <em>Id</em>}</li>
 *   <li>{@link tdt4250.MyEcore.Student#getSchool <em>School</em>}</li>
 *   <li>{@link tdt4250.MyEcore.Student#getIndividualStudyPlan <em>Individual Study Plan</em>}</li>
 * </ul>
 *
 * @see tdt4250.MyEcore.MyEcorePackage#getStudent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameCharacters'"
 * @generated
 */
public interface Student extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.MyEcore.MyEcorePackage#getStudent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.Student#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see tdt4250.MyEcore.MyEcorePackage#getStudent_FirstName()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.Student#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see tdt4250.MyEcore.MyEcorePackage#getStudent_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.Student#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>School</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.MyEcore.School#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School</em>' container reference.
	 * @see #setSchool(School)
	 * @see tdt4250.MyEcore.MyEcorePackage#getStudent_School()
	 * @see tdt4250.MyEcore.School#getStudents
	 * @model opposite="students" transient="false"
	 * @generated
	 */
	School getSchool();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.Student#getSchool <em>School</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>School</em>' container reference.
	 * @see #getSchool()
	 * @generated
	 */
	void setSchool(School value);

	/**
	 * Returns the value of the '<em><b>Individual Study Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual Study Plan</em>' containment reference.
	 * @see #setIndividualStudyPlan(IndividualStudyPlan)
	 * @see tdt4250.MyEcore.MyEcorePackage#getStudent_IndividualStudyPlan()
	 * @model containment="true"
	 * @generated
	 */
	IndividualStudyPlan getIndividualStudyPlan();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.Student#getIndividualStudyPlan <em>Individual Study Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual Study Plan</em>' containment reference.
	 * @see #getIndividualStudyPlan()
	 * @generated
	 */
	void setIndividualStudyPlan(IndividualStudyPlan value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see tdt4250.MyEcore.MyEcorePackage#getStudent_LastName()
	 * @model transient="true" volatile="true"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.Student#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see tdt4250.MyEcore.MyEcorePackage#getStudent_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.Student#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

} // Student

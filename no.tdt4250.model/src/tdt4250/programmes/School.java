/**
 */
package tdt4250.programmes;

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
 *   <li>{@link tdt4250.programmes.School#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.programmes.School#getPrograms <em>Programs</em>}</li>
 * </ul>
 *
 * @see tdt4250.programmes.ProgrammesPackage#getSchool()
 * @model
 * @generated
 */
public interface School extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.programmes.ProgrammesPackage#getSchool_Name()
	 * @model dataType="tdt4250.programmes.Name"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.programmes.School#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Programs</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.programmes.Program}.
	 * It is bidirectional and its opposite is '{@link tdt4250.programmes.Program#getSchool <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs</em>' containment reference list.
	 * @see tdt4250.programmes.ProgrammesPackage#getSchool_Programs()
	 * @see tdt4250.programmes.Program#getSchool
	 * @model opposite="school" containment="true"
	 * @generated
	 */
	EList<Program> getPrograms();

} // School

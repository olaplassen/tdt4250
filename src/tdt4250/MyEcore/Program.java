/**
 */
package tdt4250.MyEcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.Program#getProgramName <em>Program Name</em>}</li>
 *   <li>{@link tdt4250.MyEcore.Program#getProgramCreditRequirements <em>Program Credit Requirements</em>}</li>
 * </ul>
 *
 * @see tdt4250.MyEcore.MyEcorePackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Program Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Name</em>' attribute.
	 * @see #setProgramName(String)
	 * @see tdt4250.MyEcore.MyEcorePackage#getProgram_ProgramName()
	 * @model
	 * @generated
	 */
	String getProgramName();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.Program#getProgramName <em>Program Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Name</em>' attribute.
	 * @see #getProgramName()
	 * @generated
	 */
	void setProgramName(String value);

	/**
	 * Returns the value of the '<em><b>Program Credit Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Credit Requirements</em>' attribute.
	 * @see #setProgramCreditRequirements(int)
	 * @see tdt4250.MyEcore.MyEcorePackage#getProgram_ProgramCreditRequirements()
	 * @model
	 * @generated
	 */
	int getProgramCreditRequirements();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.Program#getProgramCreditRequirements <em>Program Credit Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Credit Requirements</em>' attribute.
	 * @see #getProgramCreditRequirements()
	 * @generated
	 */
	void setProgramCreditRequirements(int value);

} // Program

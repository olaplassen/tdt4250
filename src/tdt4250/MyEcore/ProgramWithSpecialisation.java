/**
 */
package tdt4250.MyEcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program With Specialisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.ProgramWithSpecialisation#getSpecilisations <em>Specilisations</em>}</li>
 * </ul>
 *
 * @see tdt4250.MyEcore.MyEcorePackage#getProgramWithSpecialisation()
 * @model
 * @generated
 */
public interface ProgramWithSpecialisation extends Program {
	/**
	 * Returns the value of the '<em><b>Specilisations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specilisations</em>' containment reference.
	 * @see #setSpecilisations(Specialisation)
	 * @see tdt4250.MyEcore.MyEcorePackage#getProgramWithSpecialisation_Specilisations()
	 * @model containment="true"
	 * @generated
	 */
	Specialisation getSpecilisations();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.ProgramWithSpecialisation#getSpecilisations <em>Specilisations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specilisations</em>' containment reference.
	 * @see #getSpecilisations()
	 * @generated
	 */
	void setSpecilisations(Specialisation value);

} // ProgramWithSpecialisation

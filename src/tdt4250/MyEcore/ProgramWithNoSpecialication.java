/**
 */
package tdt4250.MyEcore;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program With No Specialication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.ProgramWithNoSpecialication#getProgramYear <em>Program Year</em>}</li>
 * </ul>
 *
 * @see tdt4250.MyEcore.MyEcorePackage#getProgramWithNoSpecialication()
 * @model
 * @generated
 */
public interface ProgramWithNoSpecialication extends Program {
	/**
	 * Returns the value of the '<em><b>Program Year</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.MyEcore.Year}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Year</em>' containment reference list.
	 * @see tdt4250.MyEcore.MyEcorePackage#getProgramWithNoSpecialication_ProgramYear()
	 * @model containment="true"
	 * @generated
	 */
	EList<Year> getProgramYear();

} // ProgramWithNoSpecialication

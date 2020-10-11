/**
 */
package tdt4250.programmes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.programmes.Program;
import tdt4250.programmes.ProgramSemester;
import tdt4250.programmes.ProgrammesPackage;
import tdt4250.programmes.Specialization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.programmes.impl.SpecializationImpl#getSpecializesIn <em>Specializes In</em>}</li>
 *   <li>{@link tdt4250.programmes.impl.SpecializationImpl#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.programmes.impl.SpecializationImpl#getSemsters <em>Semsters</em>}</li>
 *   <li>{@link tdt4250.programmes.impl.SpecializationImpl#getSemesterSpecialization <em>Semester Specialization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializationImpl extends MinimalEObjectImpl.Container implements Specialization {
	/**
	 * The cached value of the '{@link #getSpecializesIn() <em>Specializes In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializesIn()
	 * @generated
	 * @ordered
	 */
	protected Program specializesIn;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemsters() <em>Semsters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemsters()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgramSemester> semsters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgrammesPackage.Literals.SPECIALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program getSpecializesIn() {
		if (specializesIn != null && specializesIn.eIsProxy()) {
			InternalEObject oldSpecializesIn = (InternalEObject)specializesIn;
			specializesIn = (Program)eResolveProxy(oldSpecializesIn);
			if (specializesIn != oldSpecializesIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProgrammesPackage.SPECIALIZATION__SPECIALIZES_IN, oldSpecializesIn, specializesIn));
			}
		}
		return specializesIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program basicGetSpecializesIn() {
		return specializesIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecializesIn(Program newSpecializesIn) {
		Program oldSpecializesIn = specializesIn;
		specializesIn = newSpecializesIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.SPECIALIZATION__SPECIALIZES_IN, oldSpecializesIn, specializesIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.SPECIALIZATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProgramSemester> getSemsters() {
		if (semsters == null) {
			semsters = new EObjectContainmentWithInverseEList<ProgramSemester>(ProgramSemester.class, this, ProgrammesPackage.SPECIALIZATION__SEMSTERS, ProgrammesPackage.PROGRAM_SEMESTER__ROOT_PROGRAM);
		}
		return semsters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramSemester getSemesterSpecialization() {
		if (eContainerFeatureID() != ProgrammesPackage.SPECIALIZATION__SEMESTER_SPECIALIZATION) return null;
		return (ProgramSemester)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemesterSpecialization(ProgramSemester newSemesterSpecialization, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSemesterSpecialization, ProgrammesPackage.SPECIALIZATION__SEMESTER_SPECIALIZATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemesterSpecialization(ProgramSemester newSemesterSpecialization) {
		if (newSemesterSpecialization != eInternalContainer() || (eContainerFeatureID() != ProgrammesPackage.SPECIALIZATION__SEMESTER_SPECIALIZATION && newSemesterSpecialization != null)) {
			if (EcoreUtil.isAncestor(this, newSemesterSpecialization))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSemesterSpecialization != null)
				msgs = ((InternalEObject)newSemesterSpecialization).eInverseAdd(this, ProgrammesPackage.PROGRAM_SEMESTER__SPECIALIZATIONS, ProgramSemester.class, msgs);
			msgs = basicSetSemesterSpecialization(newSemesterSpecialization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.SPECIALIZATION__SEMESTER_SPECIALIZATION, newSemesterSpecialization, newSemesterSpecialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProgrammesPackage.SPECIALIZATION__SEMSTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemsters()).basicAdd(otherEnd, msgs);
			case ProgrammesPackage.SPECIALIZATION__SEMESTER_SPECIALIZATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSemesterSpecialization((ProgramSemester)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProgrammesPackage.SPECIALIZATION__SEMSTERS:
				return ((InternalEList<?>)getSemsters()).basicRemove(otherEnd, msgs);
			case ProgrammesPackage.SPECIALIZATION__SEMESTER_SPECIALIZATION:
				return basicSetSemesterSpecialization(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ProgrammesPackage.SPECIALIZATION__SEMESTER_SPECIALIZATION:
				return eInternalContainer().eInverseRemove(this, ProgrammesPackage.PROGRAM_SEMESTER__SPECIALIZATIONS, ProgramSemester.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProgrammesPackage.SPECIALIZATION__SPECIALIZES_IN:
				if (resolve) return getSpecializesIn();
				return basicGetSpecializesIn();
			case ProgrammesPackage.SPECIALIZATION__NAME:
				return getName();
			case ProgrammesPackage.SPECIALIZATION__SEMSTERS:
				return getSemsters();
			case ProgrammesPackage.SPECIALIZATION__SEMESTER_SPECIALIZATION:
				return getSemesterSpecialization();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProgrammesPackage.SPECIALIZATION__SPECIALIZES_IN:
				setSpecializesIn((Program)newValue);
				return;
			case ProgrammesPackage.SPECIALIZATION__NAME:
				setName((String)newValue);
				return;
			case ProgrammesPackage.SPECIALIZATION__SEMSTERS:
				getSemsters().clear();
				getSemsters().addAll((Collection<? extends ProgramSemester>)newValue);
				return;
			case ProgrammesPackage.SPECIALIZATION__SEMESTER_SPECIALIZATION:
				setSemesterSpecialization((ProgramSemester)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProgrammesPackage.SPECIALIZATION__SPECIALIZES_IN:
				setSpecializesIn((Program)null);
				return;
			case ProgrammesPackage.SPECIALIZATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProgrammesPackage.SPECIALIZATION__SEMSTERS:
				getSemsters().clear();
				return;
			case ProgrammesPackage.SPECIALIZATION__SEMESTER_SPECIALIZATION:
				setSemesterSpecialization((ProgramSemester)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProgrammesPackage.SPECIALIZATION__SPECIALIZES_IN:
				return specializesIn != null;
			case ProgrammesPackage.SPECIALIZATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProgrammesPackage.SPECIALIZATION__SEMSTERS:
				return semsters != null && !semsters.isEmpty();
			case ProgrammesPackage.SPECIALIZATION__SEMESTER_SPECIALIZATION:
				return getSemesterSpecialization() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SpecializationImpl

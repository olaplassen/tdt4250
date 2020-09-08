/**
 */
package tdt4250.MyEcore.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import tdt4250.MyEcore.IndividualStudyPlan;
import tdt4250.MyEcore.MyEcorePackage;
import tdt4250.MyEcore.School;
import tdt4250.MyEcore.Student;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.impl.StudentImpl#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.StudentImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.StudentImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.StudentImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.StudentImpl#getId <em>Id</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.StudentImpl#getSchool <em>School</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.StudentImpl#getIndividualStudyPlan <em>Individual Study Plan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends MinimalEObjectImpl.Container implements Student {
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
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIndividualStudyPlan() <em>Individual Study Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualStudyPlan()
	 * @generated
	 * @ordered
	 */
	protected IndividualStudyPlan individualStudyPlan;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyEcorePackage.Literals.STUDENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.STUDENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getFirstName() {
		if (this.name == null) {
			return null;
		}
		int pos = name.lastIndexOf(' ');
		if (pos < 0) {
			return null;
		}
		return name.substring(0, pos).trim();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setFirstName(String newFirstName) {
		
		if (newFirstName == null) {
			newFirstName = "?";
		}
		setName(newFirstName + " " + getLastName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getLastName() {
		if (this.name == null) {
			return "?";
		}
		int pos = name.lastIndexOf(' ');
		if (pos < 0) {
			return name;
		}
		return name.substring(pos + 1);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setLastName(String newLastName) {
		if (newLastName == null) {
			newLastName = "?";
		}
		setName(getFirstName() + " " + newLastName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(Integer newNumber) {
		Integer oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.STUDENT__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.STUDENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public School getSchool() {
		if (eContainerFeatureID() != MyEcorePackage.STUDENT__SCHOOL) return null;
		return (School)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchool(School newSchool, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSchool, MyEcorePackage.STUDENT__SCHOOL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchool(School newSchool) {
		if (newSchool != eInternalContainer() || (eContainerFeatureID() != MyEcorePackage.STUDENT__SCHOOL && newSchool != null)) {
			if (EcoreUtil.isAncestor(this, newSchool))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchool != null)
				msgs = ((InternalEObject)newSchool).eInverseAdd(this, MyEcorePackage.SCHOOL__STUDENTS, School.class, msgs);
			msgs = basicSetSchool(newSchool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.STUDENT__SCHOOL, newSchool, newSchool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualStudyPlan getIndividualStudyPlan() {
		return individualStudyPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndividualStudyPlan(IndividualStudyPlan newIndividualStudyPlan, NotificationChain msgs) {
		IndividualStudyPlan oldIndividualStudyPlan = individualStudyPlan;
		individualStudyPlan = newIndividualStudyPlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyEcorePackage.STUDENT__INDIVIDUAL_STUDY_PLAN, oldIndividualStudyPlan, newIndividualStudyPlan);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndividualStudyPlan(IndividualStudyPlan newIndividualStudyPlan) {
		if (newIndividualStudyPlan != individualStudyPlan) {
			NotificationChain msgs = null;
			if (individualStudyPlan != null)
				msgs = ((InternalEObject)individualStudyPlan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyEcorePackage.STUDENT__INDIVIDUAL_STUDY_PLAN, null, msgs);
			if (newIndividualStudyPlan != null)
				msgs = ((InternalEObject)newIndividualStudyPlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyEcorePackage.STUDENT__INDIVIDUAL_STUDY_PLAN, null, msgs);
			msgs = basicSetIndividualStudyPlan(newIndividualStudyPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.STUDENT__INDIVIDUAL_STUDY_PLAN, newIndividualStudyPlan, newIndividualStudyPlan));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyEcorePackage.STUDENT__SCHOOL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchool((School)otherEnd, msgs);
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
			case MyEcorePackage.STUDENT__SCHOOL:
				return basicSetSchool(null, msgs);
			case MyEcorePackage.STUDENT__INDIVIDUAL_STUDY_PLAN:
				return basicSetIndividualStudyPlan(null, msgs);
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
			case MyEcorePackage.STUDENT__SCHOOL:
				return eInternalContainer().eInverseRemove(this, MyEcorePackage.SCHOOL__STUDENTS, School.class, msgs);
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
			case MyEcorePackage.STUDENT__NAME:
				return getName();
			case MyEcorePackage.STUDENT__FIRST_NAME:
				return getFirstName();
			case MyEcorePackage.STUDENT__LAST_NAME:
				return getLastName();
			case MyEcorePackage.STUDENT__NUMBER:
				return getNumber();
			case MyEcorePackage.STUDENT__ID:
				return getId();
			case MyEcorePackage.STUDENT__SCHOOL:
				return getSchool();
			case MyEcorePackage.STUDENT__INDIVIDUAL_STUDY_PLAN:
				return getIndividualStudyPlan();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MyEcorePackage.STUDENT__NAME:
				setName((String)newValue);
				return;
			case MyEcorePackage.STUDENT__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case MyEcorePackage.STUDENT__LAST_NAME:
				setLastName((String)newValue);
				return;
			case MyEcorePackage.STUDENT__NUMBER:
				setNumber((Integer)newValue);
				return;
			case MyEcorePackage.STUDENT__ID:
				setId((Integer)newValue);
				return;
			case MyEcorePackage.STUDENT__SCHOOL:
				setSchool((School)newValue);
				return;
			case MyEcorePackage.STUDENT__INDIVIDUAL_STUDY_PLAN:
				setIndividualStudyPlan((IndividualStudyPlan)newValue);
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
			case MyEcorePackage.STUDENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MyEcorePackage.STUDENT__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case MyEcorePackage.STUDENT__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case MyEcorePackage.STUDENT__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case MyEcorePackage.STUDENT__ID:
				setId(ID_EDEFAULT);
				return;
			case MyEcorePackage.STUDENT__SCHOOL:
				setSchool((School)null);
				return;
			case MyEcorePackage.STUDENT__INDIVIDUAL_STUDY_PLAN:
				setIndividualStudyPlan((IndividualStudyPlan)null);
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
			case MyEcorePackage.STUDENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MyEcorePackage.STUDENT__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? getFirstName() != null : !FIRST_NAME_EDEFAULT.equals(getFirstName());
			case MyEcorePackage.STUDENT__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? getLastName() != null : !LAST_NAME_EDEFAULT.equals(getLastName());
			case MyEcorePackage.STUDENT__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case MyEcorePackage.STUDENT__ID:
				return id != ID_EDEFAULT;
			case MyEcorePackage.STUDENT__SCHOOL:
				return getSchool() != null;
			case MyEcorePackage.STUDENT__INDIVIDUAL_STUDY_PLAN:
				return individualStudyPlan != null;
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
		result.append(", number: ");
		result.append(number);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //StudentImpl

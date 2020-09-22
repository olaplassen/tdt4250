/**
 */
package tdt4250.MyEcore.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import tdt4250.MyEcore.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see tdt4250.MyEcore.MyEcorePackage
 * @generated
 */
public class MyEcoreValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MyEcoreValidator INSTANCE = new MyEcoreValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "tdt4250.MyEcore";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyEcoreValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return MyEcorePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case MyEcorePackage.SCHOOL:
				return validateSchool((School)value, diagnostics, context);
			case MyEcorePackage.PROGRAM:
				return validateProgram((Program)value, diagnostics, context);
			case MyEcorePackage.YEAR:
				return validateYear((Year)value, diagnostics, context);
			case MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION:
				return validateProgramWithNoSpecialication((ProgramWithNoSpecialication)value, diagnostics, context);
			case MyEcorePackage.PROGRAM_WITH_SPECIALISATION:
				return validateProgramWithSpecialisation((ProgramWithSpecialisation)value, diagnostics, context);
			case MyEcorePackage.SPECIALISATION:
				return validateSpecialisation((Specialisation)value, diagnostics, context);
			case MyEcorePackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case MyEcorePackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case MyEcorePackage.STUDENT:
				return validateStudent((Student)value, diagnostics, context);
			case MyEcorePackage.INDIVIDUAL_STUDY_PLAN:
				return validateIndividualStudyPlan((IndividualStudyPlan)value, diagnostics, context);
			case MyEcorePackage.SELECTED_SEMESTER:
				return validateSelectedSemester((SelectedSemester)value, diagnostics, context);
			case MyEcorePackage.SEMESTER_KIND:
				return validateSemesterKind((SemesterKind)value, diagnostics, context);
			case MyEcorePackage.COURSE_LEVEL:
				return validateCourseLevel((CourseLevel)value, diagnostics, context);
			case MyEcorePackage.COURSE_CODE:
				return validateCourseCode((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchool(School school, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(school, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(program, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYear(Year year, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(year, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramWithNoSpecialication(ProgramWithNoSpecialication programWithNoSpecialication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programWithNoSpecialication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramWithSpecialisation(ProgramWithSpecialisation programWithSpecialisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programWithSpecialisation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialisation(Specialisation specialisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialisation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semester, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_semesterHasEnoughCredit(semester, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the semesterHasEnoughCredit constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEMESTER__SEMESTER_HAS_ENOUGH_CREDIT__EEXPRESSION = "((self.electiveCourses->collect(e | e.credit)->sum()) + (self.mandatoryCourses->collect(e | e.credit)->sum())) >=30.0";

	/**
	 * Validates the semesterHasEnoughCredit constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester_semesterHasEnoughCredit(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MyEcorePackage.Literals.SEMESTER,
				 semester,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "semesterHasEnoughCredit",
				 SEMESTER__SEMESTER_HAS_ENOUGH_CREDIT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the hasEnoughCredits constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
//	public boolean validateSemester_hasEnoughCredits(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
//		
//		float creditSum = 0.0f;
//		for (Course elective : semester.getElectiveCourses()) {
//			
//		}
//		
//	
//		// -> specify the condition that violates the constraint
//		// -> verify the diagnostic details, including severity, code, and message
//		// Ensure that you remove @generated or mark it @generated NOT
//		if (false) {
//			if (diagnostics != null) {
//				diagnostics.add
//					(createDiagnostic
//						(Diagnostic.ERROR,
//						 DIAGNOSTIC_SOURCE,
//						 0,
//						 "_UI_GenericConstraint_diagnostic",
//						 new Object[] { "hasEnoughCredits", getObjectLabel(semester, context) },
//						 new Object[] { semester },
//						 context));
//			}
//			return false;
//		}
//		return true;
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(course, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourse_correctCredit(course, diagnostics, context);
		return result;
	}

	/**
	 * Validates the correctCredit constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCourse_correctCredit(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		float credit = course.getCredit();
		float availableCredit[] = {5.0f,7.5f,10.0f,15.0f,20.0f,25.0f,30.0f};
		boolean isCreditValid = false;
		
		
		for (int i = 0; i < availableCredit.length; i++) {
			if (credit == availableCredit[i]) {
				isCreditValid = true;
			}
		}
		if (isCreditValid) {		
			return true;
		}	
		
		if (diagnostics != null) {
			diagnostics.add
				(createDiagnostic
					(Diagnostic.ERROR,
					 DIAGNOSTIC_SOURCE,
					 0,
					 "_UI_GenericConstraint_diagnostic",
					 new Object[] { "correctCredit", getObjectLabel(course, context) },
					 new Object[] { course },
					 context));
		}
		return false;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudent(Student student, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(student, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(student, diagnostics, context);
		if (result || diagnostics != null) result &= validateStudent_nameCharacters(student, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nameCharacters constraint of '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateStudent_nameCharacters(Student student, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
		if (! allowedCharacters(student.getFirstName()) && ! allowedCharacters(student.getLastName())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "nameCharacters", getObjectLabel(student, context) },
						 new Object[] { student },
						 context));
			}
			return false;
		}
		return true;
	}
	
	private boolean allowedCharacters(String name) {
	    for (int i = 0; i < name.length(); i++) {
	        char c = name.charAt(i);
	        if (! (Character.isLetter(c) || c == ' ' || c == '-' || c== '.')) {
	            return false;
	        }
	    }
	    return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndividualStudyPlan(IndividualStudyPlan individualStudyPlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(individualStudyPlan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectedSemester(SelectedSemester selectedSemester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selectedSemester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterKind(SemesterKind semesterKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseLevel(CourseLevel courseLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCode(String courseCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MyEcoreValidator
